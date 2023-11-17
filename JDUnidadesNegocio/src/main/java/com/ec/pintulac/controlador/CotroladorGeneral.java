package com.ec.pintulac.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ec.pintulac.mapper.UnidadNegocioMapper;
import com.ec.pintulac.repository.PrSucurRepository;
import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.repository.UnidadNegocioRepository;
import com.ec.pintulac.response.Row;
import com.ec.pintulac.response.UnidadNegocioResponse;
import com.ec.pintulac.services.ServicioGeneral;
import com.ec.pintulac.utilitario.TiempoEjecucion;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consumo de Ordenes de Unidades de Negocio", tags = "Unidades de Negocio")
public class CotroladorGeneral {

	@Autowired
	ServicioGeneral servicioGeneral;
	@Autowired
	RepositoryGenerico generico;

	@Autowired
	PrSucurRepository repository;

	@RequestMapping(value = "/unidades_negocio_bodega_json", method = RequestMethod.POST)
	@ApiOperation(tags = "Unidades de negocio bodega ", value = "Detallar las integraciones que componen la interfaz de salida de unidades de negocio")
	public ResponseEntity<?> unidadNegocioBode(@RequestBody Object param) {

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
			respuesta = generico.callStoreProcedureArray("DINAMIC.sp_jsonin_unidad_nego_bode", JSON);
			System.out.println(i++ + ": " + respuesta);
//			}
			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
			return new ResponseEntity<TiempoEjecucion>(
					new TiempoEjecucion(startTime, System.currentTimeMillis(), totalSum), HttpStatus.OK);
//			

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

	@RequestMapping(value = "/unidades_negocio_bodeda_entidad", method = RequestMethod.POST)
	@ApiOperation(tags = "Unidades de negocio bodega ", value = "Detallar las integraciones que componen la interfaz de salida de unidades de negocio")
	public ResponseEntity<?> unidadNegocioEntidad(@RequestBody UnidadNegocioResponse param) {

		try {
			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;
			JsonObject respuesta = new JsonObject();

			Gson gson = new Gson();
			String JSON = gson.toJson(param);
//			respuesta = generico.callStoreProcedureArray("DINAMIC.sp_jsonin_unidad_negocio", JSON);
			System.out.println(i++ + ": " + respuesta);

			for (Row item : param.getRows()) {
				repository.save(UnidadNegocioMapper.TO_ENTITY.apply(item));
			}
			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
			return new ResponseEntity<TiempoEjecucion>(
					new TiempoEjecucion(startTime, System.currentTimeMillis(), totalSum), HttpStatus.OK);

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

	@RequestMapping(value = "/unidades_negocio_sucursal", method = RequestMethod.POST)
	@ApiOperation(tags = "Unidades de negocio sucursal ", value = "Detallar las integraciones que componen la interfaz de salida de unidades de negocio")
	public ResponseEntity<?> unidadNegocio(@RequestBody Object param) {

		try {
			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;
			JsonObject respuesta = new JsonObject();
			Gson gson = new Gson();
			String JSON = gson.toJson(param);
			respuesta = generico.callStoreProcedureArray("DINAMIC.sp_jsonin_unidad_nego_sucu", JSON);
			System.out.println(i++ + ": " + respuesta);
			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum ));
			return new ResponseEntity<TiempoEjecucion>(
					new TiempoEjecucion(startTime, System.currentTimeMillis(), totalSum), HttpStatus.OK);

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

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

}
