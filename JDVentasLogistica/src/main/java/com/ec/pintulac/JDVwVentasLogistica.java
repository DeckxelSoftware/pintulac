package com.ec.pintulac;

import java.util.ArrayList;
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

import com.ec.pintulac.entidad.VwJdeVentasLogistica;
import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.repository.VwCrearOrderTransferenciaLogisticaRepository;
import com.ec.pintulac.repository.VwJdeVentaKitRepository;
import com.ec.pintulac.services.ServicioGeneral;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@EnableDiscoveryClient
@EnableScheduling
@SpringBootApplication
public class JDVwVentasLogistica extends SpringBootServletInitializer {

	@Autowired
	VwCrearOrderTransferenciaLogisticaRepository vwCrearOrderTransferenciaLogisticaRepository;
	@Autowired
	VwJdeVentaKitRepository jdeVentaKitRepository;

	@Autowired
	RepositoryGenerico generico;

	@Autowired
	ServicioGeneral servicioGeneral;

	public static void main(String[] args) {
		SpringApplication.run(JDVwVentasLogistica.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(JDVwVentasLogistica.class);
	}

	@Scheduled(fixedRate = 1 * 10 * 1000)
	public void tareaProcesaCategorias() {
		Gson gson = new Gson();

		try {

			/* ejecuta el procedimiento desgloce de descuentos */
			JsonObject respuesta = new JsonObject();
			respuesta = generico.callStoreProcedure("DINAMIC.sp_desglose_descuento");

			Object response = "SIN DATOS";
			List<VwJdeVentasLogistica> datos = vwCrearOrderTransferenciaLogisticaRepository.findAll();

//			List<String> listaDatos = new ArrayList<String>();
			if (!datos.isEmpty()) {

				for (VwJdeVentasLogistica items : datos) {

					response = servicioGeneral.invocarVentasPos(items);
					generico.update(items.getEMCODIGO(), items.getSUCODIGO(), items.getBOCODIGO(), items.getESCODIGO(),
							items.getNumero());
					String JSON = gson.toJson(response);
					System.out.println("RESPUESTA JDE " + JSON);
				}

//				return new ResponseEntity<>(response, HttpStatus.OK);
			} else {
//				return new ResponseEntity<>(response, HttpStatus.OK);
			}

		} catch (HttpClientErrorException | HttpServerErrorException ex) {

			System.err.println("Error during API request: " + ex.getMessage());

//			return ResponseEntity.status(ex.getStatusCode())
//					.body("Por favor revise los datos ingresados" + ResponseEntity.status(500));
		} catch (Exception ex) {
			ex.printStackTrace();
//			return null;
		}
	}
}
