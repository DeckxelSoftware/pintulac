package com.ec.pintulac.controlador;
import java.util.Base64;

import org.apache.http.impl.client.HttpClientBuilder;
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


import com.ec.pintulac.request.UnidadesNegocioRequest;
import com.ec.pintulac.response.UnidadesNegocioResponse;


import org.springframework.http.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consumo de Ordenes de Unidades de Negocio", tags = "Unidades de Negocio")
public class CotroladorGeneral {

	@Value("${webservices.linko.ruta}")
	private String ruta;

	@PostMapping(value = "/UnidadesNegocio")
	@ApiOperation(tags = "UnidadesNegocio", value = "UnidadesNegocio")
	public ResponseEntity<?> obtenerConsultasCostos2(@RequestBody UnidadesNegocioRequest requestBody) {
		try {
			HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
					HttpClientBuilder.create().build());
			RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);

			String authStr = "JDEDIS1:JDEDIS2";
			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());

			// create headers
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64Creds);

			HttpEntity<UnidadesNegocioRequest> requestEntity = new HttpEntity<>(requestBody, headers);
			ResponseEntity<UnidadesNegocioResponse> response = restTemplate.exchange(ruta, HttpMethod.POST,
					requestEntity, UnidadesNegocioResponse.class);

			HttpStatus statusCode = response.getStatusCode();

			if (statusCode.is2xxSuccessful()) {
				UnidadesNegocioResponse consultasCostosResponse = response.getBody();
				
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
