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

import com.ec.pintulac.services.ServicioGeneral;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "consulta_precio_item", tags = "consulta_precio_item")
public class CotroladorGeneral {

	@Autowired
	RepositoryGenerico generico;

//	@PostMapping(value = "/consulta_precios_item")
//	@ApiOperation(tags = "Modelo BDD", value = "Modelo BDD")
//	public ResponseEntity<?> consultas_mestroInventario(@RequestBody ConsutasPreciosItemResponse param) {
//		try {
////			long totalSum = 0;
////			long startTime = System.currentTimeMillis();
////			int i = 0;
////			JsonObject respuesta = new JsonObject();
//////			ExistenciaFisicaResponse JSONJDE = servicioGeneral.invocarJDE(param);
////			System.out.println("NUM ELEMENTOS: " + param.getItem().size());
//////			for (Row item : JSONJDE.getConnectorRequest1().getRows()) {
//				Gson gson = new Gson();
//				String JSON = gson.toJson(param);
////				System.out.println(JSON);
////				respuesta = generico.callStoreProcedureArray("DINAMIC.sp_jsonin_maestro_inventario ", JSON);
////				System.out.println(i++ + ": " + respuesta);
//////			}
////			totalSum = (System.currentTimeMillis() - startTime);
////			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
//			return new ResponseEntity<String>(JSON.toString(), HttpStatus.OK);
////			
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			return null;
//		}
//
//	}

	@RequestMapping(value = "/modelo-obj", method = RequestMethod.POST)
	@ApiOperation(tags = "Modelo BDD", value = "Modelo BDD")
	public ResponseEntity<?> modelo(@RequestBody Object param) {

		try {
			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;

			Gson gson = new Gson();
			String JSON = gson.toJson(param);

			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
			return new ResponseEntity<String>(JSON.toString(), HttpStatus.OK);
//			

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

	@RequestMapping(value = "/consulta_precio_item", method = RequestMethod.POST)
	@ApiOperation(tags = "Precio ", value = "Detallar las integraciones que permite consultar los cambios que han sufrido los precios base, a partir de una hora determinada. ")
	public ResponseEntity<?> consulta(@RequestBody Object param) {

		try {
			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;
			JsonObject respuesta = new JsonObject();
//			ExistenciaFisicaResponse JSONJDE = servicioGeneral.invocarJDE(param);
//			System.out.println("NUM ELEMENTOS: " + param.getRows().size());
//			for (Row item : JSONJDE.getConnectorRequest1().getRows()) {
			Gson gson = new Gson();
			String JSON = gson.toJson(param);
			respuesta = generico.callStoreProcedureArray("DINAMIC.test", JSON);
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
