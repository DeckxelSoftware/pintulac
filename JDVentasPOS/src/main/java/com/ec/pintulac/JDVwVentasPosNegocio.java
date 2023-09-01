package com.ec.pintulac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.ec.pintulac.entidad.VwJdeVentasPos;
import com.ec.pintulac.repository.VwVentasPosRepository;
import com.ec.pintulac.services.ServicioGeneral;

@EnableDiscoveryClient
@EnableScheduling
@SpringBootApplication
public class JDVwVentasPosNegocio extends SpringBootServletInitializer {

	@Autowired
	VwVentasPosRepository vwVentasPosRepository;
	@Autowired
	ServicioGeneral servicioGeneral;

	public static void main(String[] args) {
		SpringApplication.run(JDVwVentasPosNegocio.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(JDVwVentasPosNegocio.class);
	}

	@Scheduled(fixedRate = 10 * 60 * 1000)
	public void tareaProcesaCategorias() {
		System.out.println("Procesa articulos cada minuto....");

		try {
			String response = "SIN DATOS";
			List<VwJdeVentasPos> ventas = vwVentasPosRepository.findAll();
			if (!ventas.isEmpty()) {

				response = servicioGeneral.invocerVwVentasPos(ventas.get(0));
			}

			System.out.println("EJECUCION CORRECTA");
		}

		catch (HttpClientErrorException | HttpServerErrorException ex) {
			ex.printStackTrace();
			// Catch specific exceptions for handling errors
			System.err.println("Error during API request: " + ex.getMessage());
			// Handle the error response here
			// You can get the error response body using ex.getResponseBodyAsString()
			System.out.println("ERROR " + ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("ERROR " + ex.getMessage());
		}
	}
}
