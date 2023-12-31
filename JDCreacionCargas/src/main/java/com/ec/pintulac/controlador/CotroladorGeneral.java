package com.ec.pintulac.controlador;

import java.util.Base64;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ec.pintulac.request.CreacionCargasRequest;
import com.ec.pintulac.response.CreacionCargasResponse;
import com.ec.pintulac.utilitario.CredentialToken;
import com.ec.pintulac.utilitario.GestionToken;
import com.ec.pintulac.utilitario.TokenResponse;
import com.google.gson.Gson;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Creacion de Cargas", tags = "Creacion de Cargas", description = "Consumo de informacion desde aplicaciones de terceros")
public class CotroladorGeneral {

	@Value("${webservices.ruta}")
	private String ruta;
	@Value("${webservices.rutatoken}")
	private String rutatoken;
	
	@Value("${user.token}")
	private String userToken;
	@Value("${password.token}")
	private String passwordToken;

	@RequestMapping(value = "/creacion_carga", method = RequestMethod.POST)
	@ApiOperation(tags = "creacion_carga", value = "Obtiene la creacion de carga")
	public ResponseEntity<?> descuento(@RequestBody CreacionCargasRequest param) {

		try {
			// request url
//			String url = "http://150.136.243.2:7070/jderest/orchestrator/ORCH Consulta Descuentos";

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
//			headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
//			headers.set("Authorization", "Bearer " +token.getUserInfo().getToken().replace("\"", ""));

			
			
			// create request
			HttpEntity<CreacionCargasRequest> requestBody = new HttpEntity<CreacionCargasRequest>(param, headers);
			CreacionCargasResponse response = restTemplate.postForObject(ruta, requestBody,
					CreacionCargasResponse.class);

			Gson gson = new Gson();
			String JSON = gson.toJson(response);
			System.out.println("STRING JSON " + JSON);
			return new ResponseEntity<CreacionCargasResponse>(response, HttpStatus.OK);
//			

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

}
