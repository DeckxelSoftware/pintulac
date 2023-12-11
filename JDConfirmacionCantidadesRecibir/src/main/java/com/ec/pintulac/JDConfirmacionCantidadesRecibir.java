package com.ec.pintulac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.ec.pintulac.entidad.VwJdeConfirmacionCantidadesRecibir;
import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.repository.VwJDConfirmacionCantidadesRecibirRepository;
import com.ec.pintulac.services.ServicioGeneral;
import com.google.gson.Gson;

@EnableDiscoveryClient
@EnableScheduling
@SpringBootApplication
public class JDConfirmacionCantidadesRecibir extends SpringBootServletInitializer {

	@Autowired
	ServicioGeneral servicioGeneral;

	@Autowired
	RepositoryGenerico generico;

	@Autowired
	VwJDConfirmacionCantidadesRecibirRepository vwJDVentaLogisticaFacturacionRepository;

	public static void main(String[] args) {
		SpringApplication.run(JDConfirmacionCantidadesRecibir.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(JDConfirmacionCantidadesRecibir.class);
	}

	@Scheduled(fixedRate = 1 * 30 * 1000)
	public void tareaProcesa() {
		Gson gson = new Gson();
		try {
			Object response = "SIN DATOS";
			List<VwJdeConfirmacionCantidadesRecibir> ventas = vwJDVentaLogisticaFacturacionRepository.findAll();

			for (VwJdeConfirmacionCantidadesRecibir items : ventas) {

				response = servicioGeneral.invocarVentasPos(items);

				String JSON = gson.toJson(response);
				System.out.println("RESPUESTA JDE " + JSON);
				generico.update(items.getEMCODIGO(), items.getSUCODIGO(), items.getBOCODIGO(), items.getECCODIGO(),
						items.getCONUMERO());
			}

//				return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (HttpClientErrorException | HttpServerErrorException ex) {

			System.err.println("Error during API request: " + ex.getMessage());

//			return ResponseEntity.status(ex.getStatusCode())
//					.body("Por favor revise los datos ingresados" + ResponseEntity.status(400));
		} catch (Exception ex) {
			ex.printStackTrace();
//			return null;
		}
	}

}
