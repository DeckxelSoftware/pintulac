package com.ec.pintulac.controlador;
import java.util.Base64;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ec.pintulac.response.TokenResponse;

import org.springframework.http.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consumo de  descuentos", tags = "Descuentos")
public class CotroladorGeneral {

	@Value("${webservices.linko.ruta}")
	private String ruta;

	@RequestMapping(value = "/token", method = RequestMethod.GET)
	@ApiOperation(tags = "Token", value = "Obtiene Token")
	public TokenResponse obtenerToken() {

		try {

			
			HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
					HttpClientBuilder.create().build());
			RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
			
			String authStr = "JDESIF:JDESIF";
			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());

			// create headers
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64Creds);

			
			HttpEntity<String> requestEntity = new HttpEntity<>(headers);
			ResponseEntity<TokenResponse> response = restTemplate.exchange(ruta, HttpMethod.GET, requestEntity,TokenResponse.class );

			
			HttpStatus statusCode = response.getStatusCode();

			
			if (statusCode.is2xxSuccessful()) {
				TokenResponse tokenResponse=new TokenResponse();
				tokenResponse=response.getBody();
				
				String token = tokenResponse.getUsername();
				return tokenResponse;
			} else {
				System.err.println("Error al hacer la solicitud. Código de respuesta: " + statusCode.value());
				return null;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

}
