package com.ec.pintulac.controlador;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.ec.pintulac.repository.RepositoryGenerico;

import com.google.gson.Gson;
import com.google.gson.JsonObject;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consultas de costos 1 y 2", tags = "Ordenes de Venta General")
public class CotroladorGeneral {

	
	
	@Autowired
	RepositoryGenerico generico;

//	@PostMapping(value = "/ConsultasCostos1")
//	@ApiOperation(tags = "Consultas de costos alternatica 1", value = "Permite consultar el costo de un item, con el fin de almacenarlo para futuros procesos en el sistema externo")
//	public ResponseEntity<?> obtenerConsultasCostos1(@RequestBody ConsultaCostos1Request requestBody) {
//		try {
//			HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
//					HttpClientBuilder.create().build());
//			RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
//
//			String authStr = "JDEDIS1:JDEDIS2";
//			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());
//
//			// create headers
//			HttpHeaders headers = new HttpHeaders();
//			headers.add("Authorization", "Basic " + base64Creds);
//
//			HttpEntity<ConsultaCostos1Request> requestEntity = new HttpEntity<>(requestBody, headers);
//			ResponseEntity<ConsultasCostos1Response> response = restTemplate.exchange(ruta, HttpMethod.POST,
//					requestEntity, ConsultasCostos1Response.class);
//
//			HttpStatus statusCode = response.getStatusCode();
//
//			if (statusCode.is2xxSuccessful()) {
//				ConsultasCostos1Response consultasCostosResponse = response.getBody();
//				String token = consultasCostosResponse.getJdeStatus();
//				System.out.println(token);
//				return ResponseEntity.ok(consultasCostosResponse);
//			} else {
//				System.err.println("Error al hacer la solicitud. Código de respuesta: " + statusCode.value());
//				return null;
//			}
//
//		}
//
//		catch (HttpClientErrorException | HttpServerErrorException ex) {
//			// Catch specific exceptions for handling errors
//			System.err.println("Error during API request: " + ex.getMessage());
//			// Handle the error response here
//			// You can get the error response body using ex.getResponseBodyAsString()
//			return ResponseEntity.status(ex.getStatusCode()).body("Por favor revise los datos ingresados"+ResponseEntity.status(400));
//		}
//
//		catch (Exception ex) {
//			ex.printStackTrace();
//			return null;
//		}
//
//	}
	@PostMapping(value = "/consultas_costos_1")
	@ApiOperation(tags = "Consultas de costos alternatica 1", value = "Permite consultar el costo de un item, con el fin de almacenarlo para futuros procesos en el sistema externo")
	public ResponseEntity<?> unidadNegocioBode(@RequestBody Object param) {

		try {
			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;
			JsonObject respuesta = new JsonObject();
//			ExistenciaFisicaResponse JSONJDE = servicioGeneral.invocarJDE(param);
//			System.out.println("NUM ELEMENTOS: " + param.getRows().size());
//			for (Row item : JSONJDE.getConnectorRequest1().getRows()) {
			Gson gson = new Gson();
			String JSON = gson.toJson(param);
			respuesta = generico.callStoreProcedureArray("DINAMIC.test", JSON);
			System.out.println(i++ + ": " + respuesta);
//			}
			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
			return new ResponseEntity<String>(respuesta.toString(), HttpStatus.OK);
//			

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

	@PostMapping(value = "/consultas_costos_2")
	@ApiOperation(tags = "Consultas de costos alternatica 2", value = "Permite consultar el costo de un item, con el fin de almacenarlo para futuros procesos en el sistema externo")
	public ResponseEntity<?> unidadNegocio(@RequestBody Object param) {

		try {
			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;
			JsonObject respuesta = new JsonObject();
//			ExistenciaFisicaResponse JSONJDE = servicioGeneral.invocarJDE(param);
//			System.out.println("NUM ELEMENTOS: " + param.getRows().size());
//			for (Row item : JSONJDE.getConnectorRequest1().getRows()) {
			Gson gson = new Gson();
			String JSON = gson.toJson(param);
			respuesta = generico.callStoreProcedureArray("DINAMIC.sp_jsonin_unidad_negocio", JSON);
			System.out.println(i++ + ": " + respuesta);
//			}
			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
			return new ResponseEntity<String>(respuesta.toString(), HttpStatus.OK);
//			

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

	@RequestMapping(value = "/modelo-obj", method = RequestMethod.POST)
	@ApiOperation(tags = "Modelo BDD", value = "Modelo BDD")
	public ResponseEntity<?> modelo(@RequestBody Object param) {

		try {
			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;

			Gson gson = new Gson();
			String JSON = gson.toJson(param);

			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
			return new ResponseEntity<String>(JSON.toString(), HttpStatus.OK);
//			

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}
}
