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

import com.ec.pintulac.request.DescuentoRequest;
import com.ec.pintulac.response.DescuentoResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consumo de  descuentos", tags = "Descuentos", description = "Consumo de informacion desde aplicaciones de terceros")
public class CotroladorGeneral {

	@Value("${webservices.linko.ruta}")
	private String ruta;
	


	@RequestMapping(value = "/consulta_descuento", method = RequestMethod.POST)
	@ApiOperation(tags = "Descuentos", value = "Obtiene los descuentos uno mediante paginacion (pagina= numero de pagina, cantidad= numero de registros de retorno)")
	public ResponseEntity<?> descuento(@RequestBody DescuentoRequest param) {

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
			HttpEntity<DescuentoRequest> requestBody = new HttpEntity<DescuentoRequest>(param, headers);
//		    HttpEntity<String> request = new HttpEntity(headers);

			// make a request

			DescuentoResponse response = restTemplate.postForObject(ruta, requestBody, DescuentoResponse.class);
		
//		    ResponseEntity<String> response = new RestTemplate().exchange(url, HttpMethod.POST, request, String.class);

			// get JSON response
//		    String json = response.getBody();
//			return response;
//			ProcessBuilder processBuilder = new ProcessBuilder();
//					processBuilder.directory(new File("D:\\bash.sh"));
//					Process process = processBuilder.start();
			
					
//					ProcessBuilder processBuilder = new ProcessBuilder();
//							processBuilder.directory(new File("D:\\bash.sh"));
//							Process process = processBuilder.start();
//							
//							String path = "D:\\bash.bat";
//									String[] command = {"bat",path};
//									Process process = Runtime.getRuntime().exec(command);
//					
//					String commandRead;
//					 
//					   BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
//					    
//					    while ((commandRead = stdInput.readLine()) != null) {
//					    	
//					    	System.out.println(commandRead);
////					      log.info(commandRead);
//					    }
//					    BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//					    while ((commandRead = stdError.readLine()) != null) {
////					      log.info(commandRead);
//					      System.out.println(commandRead);
//					    }
			return new ResponseEntity<DescuentoResponse>(response, HttpStatus.OK);
//			

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

}
