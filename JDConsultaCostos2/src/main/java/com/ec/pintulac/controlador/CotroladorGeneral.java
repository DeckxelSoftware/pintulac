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
import org.springframework.web.client.RestTemplate;

import com.ec.pintulac.request.OrdenVentasGeneralRequest;
import com.ec.pintulac.response.OrdenVentaGeneralResponse;

import org.springframework.http.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consumo de Ordenes de Venta General", tags = "Ordenes de Venta General")
public class CotroladorGeneral {

	@Value("${webservices.linko.ruta}")
	private String ruta;

	@PostMapping(value = "/OrdenesVentaGeneral")
	@ApiOperation(tags = "Ordenes Venta General", value = "Ordenes Venta General")
	public OrdenVentaGeneralResponse obtenerOrdenesVentaGeneral(@RequestBody OrdenVentasGeneralRequest requestBody) {
		try {
			HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
					HttpClientBuilder.create().build());
			RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
			
			String authStr = "JDEDIS1:JDEDIS2";
			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());

			// create headers
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64Creds);

			
			HttpEntity<OrdenVentasGeneralRequest> requestEntity = new HttpEntity<>(requestBody,headers);
			ResponseEntity<OrdenVentaGeneralResponse> response = restTemplate.exchange(ruta, HttpMethod.POST, requestEntity,OrdenVentaGeneralResponse.class );

			
			HttpStatus statusCode = response.getStatusCode();

			
			if (statusCode.is2xxSuccessful()) {
				OrdenVentaGeneralResponse tokenResponse=new OrdenVentaGeneralResponse();
				tokenResponse=response.getBody();
				
				String token = tokenResponse.getJdeStatus();
				System.out.println(token);
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
