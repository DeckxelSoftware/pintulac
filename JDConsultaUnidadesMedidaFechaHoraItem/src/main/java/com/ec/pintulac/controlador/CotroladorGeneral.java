package com.ec.pintulac.controlador;

import java.util.Base64;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.request.ConsultaUnidadesMedidaFechaHoraItemRequest;
import com.ec.pintulac.response.ConsultaUnidadesMedidaFechaHoraItemResponse;
import com.ec.pintulac.response.SDComunicacionUnidadesMedida;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.springframework.http.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consumo de Ordenes de Venta General", tags = "Ordenes de Venta General")
public class CotroladorGeneral {

	@Value("${webservices.linko.ruta}")
	private String ruta;

	@Autowired
	RepositoryGenerico generico;

//	@PostMapping(value = "/ConsultaUnidadesMedidaFechaHoraIte")
//	@ApiOperation(tags = "Consulta Unidades de Medida por Fecha, Hora e Item", value = "Consulta Unidades de Medida por Fecha, Hora e Item")
//	public ResponseEntity<?> obtenerConsultaUnidadesMedidaFechaHoraItem(@RequestBody ConsultaUnidadesMedidaFechaHoraItemRequest requestBody) {
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
//			HttpEntity<ConsultaUnidadesMedidaFechaHoraItemRequest> requestEntity = new HttpEntity<>(requestBody, headers);
//			ResponseEntity<ConsultaUnidadesMedidaFechaHoraItemResponse> response = restTemplate.exchange(ruta, HttpMethod.POST,
//					requestEntity, ConsultaUnidadesMedidaFechaHoraItemResponse.class);
//
//			HttpStatus statusCode = response.getStatusCode();
//
//			if (statusCode.is2xxSuccessful()) {
//				ConsultaUnidadesMedidaFechaHoraItemResponse consultasResponse = response.getBody();
//				return ResponseEntity.ok( consultasResponse);
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
//	@PostMapping(value = "/consultas_maestroInventario")
//	@ApiOperation(tags = "ConsultasMestro de Inventarios", value = "Detallar las integraciones que componen la interfaz de salida de maestro de items")
//	public ResponseEntity<?> consultas_mestroInventario(@RequestBody SDComunicacionUnidadesMedida param) {
//		try {
//			long totalSum = 0;
//			long startTime = System.currentTimeMillis();
//			int i = 0;
//			JsonObject respuesta = new JsonObject();
////			ExistenciaFisicaResponse JSONJDE = servicioGeneral.invocarJDE(param);
//			System.out.println("NUM ELEMENTOS: " + param.getRowset().size());
////			for (Row item : JSONJDE.getConnectorRequest1().getRows()) {
//			Gson gson = new Gson();
//			String JSON = gson.toJson(param);
//			respuesta = generico.callStoreProcedureArray("sp_jsonin_unidMedid_itemFec", JSON);
//			System.out.println(i++ + ": " + respuesta);
////			}
//			totalSum = (System.currentTimeMillis() - startTime);
//			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
//			return new ResponseEntity<String>(respuesta.toString(), HttpStatus.OK);
////			
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			return null;
//		}
//
//	}

	@PostMapping(value = "/consulta_unidades_medida_fecha_hora_item")
	@ApiOperation(tags = "Consulta Unidades de Medida por Fecha, Hora e Item", value = "Consulta Unidades de Medida por Fecha, Hora e Item")
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
			respuesta = generico.callStoreProcedureArray("DINAMIC.sp_jsonin_unidMedid_itemFec", JSON);
			System.out.println(i++ + ": " + respuesta);
//			}
			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
			return new ResponseEntity<String>(respuesta.toString(), HttpStatus.OK);
//			

		} catch (Exception ex) {
			ex.printStackTrace();
			String stacktrace = ExceptionUtils.getStackTrace(ex);
			return new ResponseEntity<String>("ERROR: "+stacktrace, HttpStatus.BAD_REQUEST);
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
