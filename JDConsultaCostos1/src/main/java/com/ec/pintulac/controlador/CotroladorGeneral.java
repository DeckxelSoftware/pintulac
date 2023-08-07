package com.ec.pintulac.controlador;

import java.util.Base64;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.ec.pintulac.request.ConsultaCostos1Request;
import com.ec.pintulac.response.ConsultasCostos1Response;

import org.springframework.http.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consumo de Ordenes de Venta General", tags = "Ordenes de Venta General")
public class CotroladorGeneral {

	@Value("${webservices.linko.ruta}")
	private String ruta;

	@PostMapping(value = "/ConsultasCostos1")
	@ApiOperation(tags = "Consultas de costos alternatica 1", value = "Consultas de costos alternatica 1")
	public ResponseEntity<?> obtenerConsultasCostos1(@RequestBody ConsultaCostos1Request requestBody) {
		try {
			HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
					HttpClientBuilder.create().build());
			RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);

			String authStr = "JDEDIS1:JDEDIS2";
			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());

			// create headers
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64Creds);

			HttpEntity<ConsultaCostos1Request> requestEntity = new HttpEntity<>(requestBody, headers);
			ResponseEntity<ConsultasCostos1Response> response = restTemplate.exchange(ruta, HttpMethod.POST,
					requestEntity, ConsultasCostos1Response.class);

			HttpStatus statusCode = response.getStatusCode();

			if (statusCode.is2xxSuccessful()) {
				ConsultasCostos1Response consultasCostosResponse = response.getBody();
				String token = consultasCostosResponse.getJdeStatus();
				System.out.println(token);
				return ResponseEntity.ok(consultasCostosResponse);
			} else {
				System.err.println("Error al hacer la solicitud. Código de respuesta: " + statusCode.value());
				return null;
			}

		}

		catch (HttpClientErrorException | HttpServerErrorException ex) {
			// Catch specific exceptions for handling errors
			System.err.println("Error during API request: " + ex.getMessage());
			// Handle the error response here
			// You can get the error response body using ex.getResponseBodyAsString()
			return ResponseEntity.status(ex.getStatusCode()).body("Por favor revise los datos ingresados"+ResponseEntity.status(400));
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

}
