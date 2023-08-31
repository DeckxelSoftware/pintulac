package com.ec.pintulac.services;

import java.util.Base64;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import com.ec.pintulac.request.MaestroInventariosRequest;
import com.ec.pintulac.response.MaestroInventarioResponse;


@Service
public class ServicioGeneral {
	
	
	@Value("${webservices.ruta}")
	private String ruta;
	@Value("${webservices.rutatoken}")
	private String rutatoken;

	@Value("${user.token}")
	private String userToken;
	@Value("${password.token}")
	private String passwordToken;

	public MaestroInventarioResponse invocarJDE(MaestroInventariosRequest param) {
		try {
			HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
					HttpClientBuilder.create().build());
			RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);

			String authStr = "JDEDIS1:JDEDIS2";
			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());

			// create headers
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64Creds);

			HttpEntity<MaestroInventariosRequest> requestEntity = new HttpEntity<>(param, headers);
			ResponseEntity<MaestroInventarioResponse> response = restTemplate.exchange(ruta, HttpMethod.POST,
					requestEntity, MaestroInventarioResponse.class);

			HttpStatus statusCode = response.getStatusCode();

			if (statusCode.is2xxSuccessful()) {
				MaestroInventarioResponse consultasCostosResponse = response.getBody();
				
				return consultasCostosResponse;
			} else {
				System.err.println("Error al hacer la solicitud. Código de respuesta: " + statusCode.value());
				return null;
			}

		}

//		catch (HttpClientErrorException | HttpServerErrorException ex) {
//			// Catch specific exceptions for handling errors
//			System.err.println("Error during API request: " + ex.getMessage());
//			// Handle the error response here
//			// You can get the error response body using ex.getResponseBodyAsString()
//			return ResponseEntity.status(ex.getStatusCode()).body("Por favor revise los datos ingresados"+ResponseEntity.status(400));
//		}

		catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}
}
