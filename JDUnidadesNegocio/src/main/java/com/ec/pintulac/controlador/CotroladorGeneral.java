package com.ec.pintulac.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.response.ConnectorRequest1Data;
import com.ec.pintulac.services.ServicioGeneral;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consumo de Ordenes de Unidades de Negocio", tags = "Unidades de Negocio")
public class CotroladorGeneral {

	@Autowired
	ServicioGeneral servicioGeneral;
	@Autowired
	RepositoryGenerico generico;

//
//	@PostMapping(value = "/UnidadesNegocio")
//	@ApiOperation(tags = "UnidadesNegocio", value = "UnidadesNegocio")
//	public ResponseEntity<?> obtenerConsultasCostos2(@RequestBody UnidadesNegocioRequest requestBody) {
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
//			HttpEntity<UnidadesNegocioRequest> requestEntity = new HttpEntity<>(requestBody, headers);
//			ResponseEntity<UnidadesNegocioResponse> response = restTemplate.exchange(ruta, HttpMethod.POST,
//					requestEntity, UnidadesNegocioResponse.class);
//
//			HttpStatus statusCode = response.getStatusCode();
//
//			if (statusCode.is2xxSuccessful()) {
//				UnidadesNegocioResponse consultasCostosResponse = response.getBody();
//				
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
//	
	@RequestMapping(value = "/unidades_negocio", method = RequestMethod.POST)
	@ApiOperation(tags = "Unidades de negocio ", value = "Detallar las integraciones que componen la interfaz de salida de unidades de negocio")
	public ResponseEntity<?> existenciaJDE(@RequestBody ConnectorRequest1Data param) {

		try {
			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;
			JsonObject respuesta = new JsonObject();
//			ExistenciaFisicaResponse JSONJDE = servicioGeneral.invocarJDE(param);
			System.out.println("NUM ELEMENTOS: " + param.getItem().size());
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

	@RequestMapping(value = "/modelo", method = RequestMethod.POST)
	@ApiOperation(tags = "Modelo BDD", value = "Modelo BDD")
	public ResponseEntity<?> modelo(@RequestBody ConnectorRequest1Data param) {

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
