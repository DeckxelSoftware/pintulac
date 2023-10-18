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
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.ec.pintulac.entidad.VwJdeGeneracionRequisicionComprasNoInventariables;

import com.ec.pintulac.request.CodigosCategoriaRequest;
import com.ec.pintulac.response.CodigosCategoriaResponse;
import com.ec.pintulac.utilitario.CredentialToken;
import com.ec.pintulac.utilitario.GestionToken;
import com.ec.pintulac.utilitario.TokenResponse;

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

	public String invocarVentasPos(VwJdeGeneracionRequisicionComprasNoInventariables param) {

		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
				HttpClientBuilder.create().build());
		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
		// create auth credentials
		CredentialToken credentialToken = new CredentialToken(userToken, passwordToken);
		TokenResponse token = GestionToken.obtenerToken(credentialToken, rutatoken);

		// create headers

		HttpHeaders headers = new HttpHeaders();
		String authStr = "JDEDIS1:JDEDIS2";
		String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());
		headers.add("Authorization", "Basic " + base64Creds);
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
//		headers.set("Authorization", "Bearer " +token.getUserInfo().getToken().replace("\"", ""));

		// create request
		HttpEntity<String> requestBody = new HttpEntity<String>(param.getDato_json(), headers);
		ResponseEntity<String> response = restTemplate.postForEntity(ruta, requestBody, String.class);

		return response.getBody();

	}

}
