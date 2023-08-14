package com.ec.pintulac.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ec.pintulac.modelo.InMarcag;
import com.ec.pintulac.modelo.InMarcas;
import com.ec.pintulac.modelo.InUnibas;
import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.response.ConnectorRequest1;
import com.ec.pintulac.services.ServicioGeneral;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "UDC", tags = "Creacion de UDC", description = "Ingreso de informacion UDC")
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

	
	@RequestMapping(value = "/unibas", method = RequestMethod.POST)
	@ApiOperation(tags = "UDC", value = "Registrar o actulizar unibas")
	public ResponseEntity<?> unibas(@RequestBody InUnibas param) {

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
	
	@RequestMapping(value = "/marcas", method = RequestMethod.POST)
	@ApiOperation(tags = "UDC", value = "Registrar o actulizar marcas")
	public ResponseEntity<?> marcas(@RequestBody InMarcas param) {

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
	
	@RequestMapping(value = "/marcas_g", method = RequestMethod.POST)
	@ApiOperation(tags = "UDC", value = "Registrar o actulizar marcag")
	public ResponseEntity<?> marcasG(@RequestBody InMarcag param) {

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
