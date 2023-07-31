package com.ec.pintulac.controlador;

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

import com.ec.pintulac.request.CreacionCargasRequest;
import com.ec.pintulac.response.CreacionCargasResponse;
import com.google.gson.Gson;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Creacion de Cargas", tags = "Creacion de Cargas", description = "Consumo de informacion desde aplicaciones de terceros")
public class CotroladorGeneral {

	@Value("${webservices.linko.ruta}")
	private String ruta;

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
			String authStr = "JDEDIS1:JDEDIS2";
			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());

			// create headers
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64Creds);

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
