package com.ec.pintulac.services;

import java.util.Base64;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ec.pintulac.entidad.VwCrearActualizaCliente;
import com.ec.pintulac.request.MaestroClientesLDRequest;
import com.ec.pintulac.response.MaestroClientesLDResponse;


@Service
public class ServicioGeneral {
	
	
	@Value("${webservices.ruta}")
	private String ruta;
	
	
	@Value("${webservices.rutain}")
	private String rutain;
	
	@Value("${webservices.rutatoken}")
	private String rutatoken;

	@Value("${user.token}")
	private String userToken;
	@Value("${password.token}")
	private String passwordToken;

	public MaestroClientesLDResponse invocarJDE(MaestroClientesLDRequest param) {
		try {
			HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
					HttpClientBuilder.create().build());
			RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);

			String authStr = "JDEDIS1:JDEDIS2";
			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());

			// create headers
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64Creds);

			HttpEntity<MaestroClientesLDRequest> requestEntity = new HttpEntity<>(param, headers);
			ResponseEntity<MaestroClientesLDResponse> response = restTemplate.exchange(ruta, HttpMethod.POST,
					requestEntity, MaestroClientesLDResponse.class);

			HttpStatus statusCode = response.getStatusCode();

			if (statusCode.is2xxSuccessful()) {
				MaestroClientesLDResponse consultasCostosResponse = response.getBody();
				
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
	
	
	
	
	public String invocarCreaActualizaCliente(VwCrearActualizaCliente param) {

		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
				HttpClientBuilder.create().build());
		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
		// create auth credentials
//		CredentialToken credentialToken = new CredentialToken(userToken, passwordToken);
//		TokenResponse token = GestionToken.obtenerToken(credentialToken, rutatoken);
		
		// create headers

		HttpHeaders headers = new HttpHeaders();
		String authStr = "JDESIF:JDESIF";
		String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());
		headers.add("Authorization", "Basic " + base64Creds);
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
//		headers.set("Authorization", "Bearer " +token.getUserInfo().getToken().replace("\"", ""));

		// create request
		HttpEntity<String> requestBody = new HttpEntity<String>(param.getDatoJson(), headers);
		 ResponseEntity<String> response = restTemplate.postForEntity(rutain, requestBody,
				 String.class);

	

		return response.getBody();

	}
}
