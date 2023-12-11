package com.ec.pintulac.controlador;

import java.util.Base64;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.http.impl.client.HttpClientBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ec.pintulac.repository.RepositoryGenerico;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consumo de Ordenes de Venta General", tags = "Ordenes de Venta General")
public class CotroladorGeneral {

	@Value("${webservices.linko.ruta}")
	private String ruta;

	@Autowired
	RepositoryGenerico generico;

	@PostMapping(value = "/consulta_unidades_medida_fecha_hora_item")
	@ApiOperation(tags = "Consulta Unidades de Medida por Fecha, Hora e Item", value = "Consulta Unidades de Medida por Fecha, Hora e Item")
	public ResponseEntity<?> unidadNegocio(@RequestBody Object param) {

		try {
			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;
			JsonObject respuesta = new JsonObject();
			Gson gson = new Gson();
			String JSON = gson.toJson(param);
			respuesta = generico.callStoreProcedureArray("DINAMIC.sp_jsonin_unidMedid_itemFec", JSON);
			System.out.println(i++ + ": " + respuesta);
			// }
			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
			return new ResponseEntity<String>(respuesta.toString(), HttpStatus.OK);
			//

		} catch (Exception ex) {
			ex.printStackTrace();
			String stacktrace = ExceptionUtils.getStackTrace(ex);
			return new ResponseEntity<String>("ERROR: " + stacktrace, HttpStatus.BAD_REQUEST);
		}

	}

}
