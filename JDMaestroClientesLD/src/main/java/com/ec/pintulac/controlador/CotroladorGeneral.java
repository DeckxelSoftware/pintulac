package com.ec.pintulac.controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.response.MaestroClientesLDResponse;
import com.ec.pintulac.services.ServicioGeneral;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api
public class CotroladorGeneral {

	@Autowired
	ServicioGeneral servicioGeneral;
	
	@Autowired
	RepositoryGenerico generico;
	
	@Value("${webservices.linko.ruta}")
	private String ruta;
	
	@Value("${webservices.rutatoken}")
	private String rutatoken;
	
	@Value("${user.token}")
	private String userToken;
	@Value("${password.token}")
	private String passwordToken;

	
//	
//	@PostMapping(value = "/maestro_clientes_est")
//	@ApiOperation(tags = "maestro_clientes_LD2", value = "Detallar las integraciones que componen la interfaz de salida de maestro de clientes en el libro de direcciones.")
//	public MaestroClientesLDResponse obtener(@RequestBody MaestroClientesLDRequest param) {
//		try {
//			HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
//					HttpClientBuilder.create().build());
//			RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
//
//			String authStr = "JDESIF:JDESIF";
//			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());
//
//			// create headers
//			HttpHeaders headers = new HttpHeaders();
//			headers.add("Authorization", "Basic " + base64Creds);
//
//			HttpEntity<MaestroClientesLDRequest> requestEntity = new HttpEntity<>(param, headers);
//			ResponseEntity<MaestroClientesLDResponse> response = restTemplate.exchange(ruta, HttpMethod.POST,
//					requestEntity, MaestroClientesLDResponse.class);
//
//			HttpStatus statusCode = response.getStatusCode();
//
//			if (statusCode.is2xxSuccessful()) {
//				MaestroClientesLDResponse consultasCostosResponse = response.getBody();
//				
//				return consultasCostosResponse;
//			} else {
//				System.err.println("Error al hacer la solicitud. Código de respuesta: " + statusCode.value());
//				return null;
//			}
//
//		}
//
//
//
//		catch (Exception ex) {
//			ex.printStackTrace();
//			return null;
//		}
//
//	}
	
	
	@RequestMapping(value = "/maestro_clientes_LD2", method = RequestMethod.POST)
	@ApiOperation(tags = "maestro_clientes_LD2", value = "Registrar o actulizar marcas")
	public ResponseEntity<?> maestroClientes(@RequestBody MaestroClientesLDResponse param) {

		try {
			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;
			JsonObject respuesta = new JsonObject();
//			ExistenciaFisicaResponse JSONJDE = servicioGeneral.invocarJDE(param);
			
//			for (Row item : JSONJDE.getConnectorRequest1().getRows()) {
				Gson gson = new Gson();
				String JSON = gson.toJson(param);
				respuesta = generico.callStoreProcedureArray("DINAMIC.sp_json3_existencia", JSON);
				System.out.println(i++ + ": " + respuesta);
//			}
			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
			return new ResponseEntity<String>(respuesta.toString(), HttpStatus.OK);
//			

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

}
