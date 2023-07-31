package com.ec.pintulac.controlador;

import org.springframework.http.*;
import java.util.Base64;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ec.pintulac.request.DescuentoRequest;
import com.ec.pintulac.response.DescuentoResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consumo de  descuentos", tags = "Recuperar Token", description = "Consumo de informacion desde aplicaciones de terceros")
public class CotroladorGeneral {

	@Value("${webservices.linko.ruta}")
	private String ruta;

	@RequestMapping(value = "/token", method = RequestMethod.GET)
	@ApiOperation(tags = "Token", value = "Obtiene Token")
	public String obtenerToken() {

		try {

			
			HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
					HttpClientBuilder.create().build());
			RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
			// create auth credentials
			String authStr = "JDESIF:JDESIF";
			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());

			// create headers
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64Creds);

			// Configuramos la entidad http y realizamos peticion get
			HttpEntity<String> requestEntity = new HttpEntity<>(headers);
			ResponseEntity<String> response = restTemplate.exchange(ruta, HttpMethod.GET, requestEntity, String.class);

			// Obtener el código de estado HTTP de la respuesta
			HttpStatus statusCode = response.getStatusCode();

			// Procesar la respuesta
			if (statusCode.is2xxSuccessful()) {
				String responseBody = response.getBody();
				System.out.println("Respuesta: " + responseBody);
				return responseBody;
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
