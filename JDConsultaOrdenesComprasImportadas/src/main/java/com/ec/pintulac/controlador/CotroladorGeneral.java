package com.ec.pintulac.controlador;

import java.util.Base64;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.request.CodigosCategoriaRequest;
import com.ec.pintulac.response.ConnectorRequest1Data;
import com.ec.pintulac.response.CodigosCategoriaResponse;
import com.ec.pintulac.services.ServicioGeneral;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api
public class CotroladorGeneral {

	@Autowired
	ServicioGeneral servicioGeneral;

	@Autowired
	RepositoryGenerico generico;

//	
//	@PostMapping(value = "/codigos_categoria1")
//	@ApiOperation(tags = "Códigos categoria", value = "Este API le permite consultar la lista de valores de los campos de la creación de clientes asociados a códigos de categoría")
//	public CodigosCategoriaResponse obtener(@RequestBody CodigosCategoriaRequest param) {
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
//			HttpEntity<CodigosCategoriaRequest> requestEntity = new HttpEntity<>(param, headers);
//			ResponseEntity<CodigosCategoriaResponse> response = restTemplate.exchange(ruta, HttpMethod.POST,
//					requestEntity, CodigosCategoriaResponse.class);
//
//			HttpStatus statusCode = response.getStatusCode();
//
//			if (statusCode.is2xxSuccessful()) {
//				CodigosCategoriaResponse consultasCostosResponse = response.getBody();
//				
//				return consultasCostosResponse;
//			} else {
//				System.err.println("Error al hacer la solicitud. Código de respuesta: " + statusCode.value());
//				return null;
//			}
//
//		}
//
////		catch (HttpClientErrorException | HttpServerErrorException ex) {
////			// Catch specific exceptions for handling errors
////			System.err.println("Error during API request: " + ex.getMessage());
////			// Handle the error response here
////			// You can get the error response body using ex.getResponseBodyAsString()
////			return ResponseEntity.status(ex.getStatusCode()).body("Por favor revise los datos ingresados"+ResponseEntity.status(400));
////		}
//
//		catch (Exception ex) {
//			ex.printStackTrace();
//			return null;
//		}
//
//	}
	@PostMapping(value = "/consulta_ordenes_compras_importadas")
	@ApiOperation(tags = "Consulta Ordenes ComprasImportadas", value = "Detallar los elementos que conforman la integración de salida desde JDE para la consulta de órdenes de compras importadas")
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
