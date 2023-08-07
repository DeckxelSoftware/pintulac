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
import com.ec.pintulac.request.ExistenciaFisicaRequest;
import com.ec.pintulac.response.ConnectorRequest1;
import com.ec.pintulac.response.ExistenciaFisicaResponse;
import com.ec.pintulac.response.Row;
import com.ec.pintulac.services.ServicioGeneral;
import com.ec.pintulac.utilitario.CredentialToken;
import com.ec.pintulac.utilitario.GestionToken;
import com.ec.pintulac.utilitario.TokenResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

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

	@Autowired
	ServicioGeneral servicioGeneral;
	@Autowired
	RepositoryGenerico generico;

//	@RequestMapping(value = "/consulta_existencia_fisica", method = RequestMethod.POST)
//	@ApiOperation(tags = "Existencia fisica", value = "Detallar las integraciones que permite consultar las existencias de un ítem, en este servicio se tiene acceso a información detallada del dato como: Lote, ubicación, compromisos, existencias.  ")
//	public ResponseEntity<?> descuento(@RequestBody ExistenciaFisicaRequest param) {
//
//		try {
//			long totalSum = 0;
//			long startTime = System.currentTimeMillis();
//			int i = 0;
//			JsonObject respuesta = new JsonObject();
//			ExistenciaFisicaResponse JSONJDE = servicioGeneral.invocarJDE(param);
//			System.out.println("NUM ELEMENTOS: " + JSONJDE.getConnectorRequest1().getRows().size());
//			for (Row item : JSONJDE.getConnectorRequest1().getRows()) {
//				Gson gson = new Gson();
//				String JSON = gson.toJson(item);
//				respuesta = generico.callStoreProcedure("DINAMIC.sp_json3_existencia", JSON);
//				System.out.println(i++ + ": " + respuesta);
//			}
//			totalSum = (System.currentTimeMillis() - startTime);
//			System.out.println("Tiempo ejecucion" + (totalSum / 1000) / 60);
//			return new ResponseEntity<String>(respuesta.toString(), HttpStatus.OK);
////			
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			return null;
//		}
//
//	}
//
//	
//	@RequestMapping(value = "/consulta_existencia_fisica_array", method = RequestMethod.POST)
//	@ApiOperation(tags = "Existencia fisica array", value = "Detallar las integraciones que permite consultar las existencias de un ítem, en este servicio se tiene acceso a información detallada del dato como: Lote, ubicación, compromisos, existencias.  ")
//	public ResponseEntity<?> existenciaArray(@RequestBody ExistenciaFisicaRequest param) {
//
//		try {
//			
//		
//			
//			long totalSum = 0;
//			long startTime = System.currentTimeMillis();
//			int i = 0;
//			JsonObject respuesta = new JsonObject();
//			ExistenciaFisicaResponse JSONJDE = servicioGeneral.invocarJDE(param);
//			System.out.println("NUM ELEMENTOS: " + JSONJDE.getConnectorRequest1().getRows().size());
////			for (Row item : JSONJDE.getConnectorRequest1().getRows()) {
//				Gson gson = new Gson();
//				String JSON = gson.toJson(JSONJDE.getConnectorRequest1());
//				respuesta = generico.callStoreProcedureArray("DINAMIC.sp_json3_existencia", JSON);
//				System.out.println(i++ + ": " + respuesta);
////			}
//			totalSum = (System.currentTimeMillis() - startTime);
//			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
//			return new ResponseEntity<String>(respuesta.toString(), HttpStatus.OK);
////			
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			return null;
//		}
//
//	}
//	
	@RequestMapping(value = "/existencia_jde", method = RequestMethod.POST)
	@ApiOperation(tags = "Existencia fisica jde", value = "Detallar las integraciones que permite consultar las existencias de un ítem, en este servicio se tiene acceso a información detallada del dato como: Lote, ubicación, compromisos, existencias.  ")
	public ResponseEntity<?> existenciaJDE(@RequestBody ConnectorRequest1 param) {

		try {
			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;
			JsonObject respuesta = new JsonObject();
//			ExistenciaFisicaResponse JSONJDE = servicioGeneral.invocarJDE(param);
			System.out.println("NUM ELEMENTOS: " + param.getRows().size());
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
