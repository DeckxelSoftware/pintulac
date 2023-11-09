package com.ec.pintulac.controlador;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.services.ServicioGeneral;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consumo de Ordenes de ConsultasMestro de Inventarios", tags = "ConsultasMestro de Inventarios")
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


	@PostMapping(value = "/maestro_inventarios")
	@ApiOperation(tags = "Consulta Maestro Inventarios", value = "Detallar Consulta Maestro Inventarios")
	public ResponseEntity<?> unidadNegocio(@RequestBody Object param) {
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
			System.out.println("JSON "+JSON);
			respuesta = generico.callStoreProcedureArray("DINAMIC.sp_jsonin_maestro_inventario", JSON);
			System.out.println(i++ + ": " + respuesta);
//			}
			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
			return new ResponseEntity<String>(respuesta==null?"Respuesta nula":respuesta.toString(), HttpStatus.OK);
//			

		} catch (Exception ex) {
			ex.printStackTrace();
			String stacktrace = ExceptionUtils.getStackTrace(ex);
			return new ResponseEntity<String>("ERROR: "+stacktrace, HttpStatus.BAD_REQUEST);
			
		}

	}

//	@RequestMapping(value = "/modelo-obj", method = RequestMethod.POST)
//	@ApiOperation(tags = "Modelo BDD", value = "Modelo BDD")
//	public ResponseEntity<?> modelo(@RequestBody Object param) {
//
//		try {
//			long totalSum = 0;
//			long startTime = System.currentTimeMillis();
//			int i = 0;
//
//			Gson gson = new Gson();
//			String JSON = gson.toJson(param);
//
//			totalSum = (System.currentTimeMillis() - startTime);
//			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
//			return new ResponseEntity<String>(JSON.toString(), HttpStatus.OK);
////			
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			return null;
//		}
//
//	}
}
