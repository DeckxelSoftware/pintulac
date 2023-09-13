package com.ec.pintulac.controlador;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.ec.pintulac.entidad.VwJdeVentasLogistica;
import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.repository.VwVentasPosRepository;
import com.ec.pintulac.services.ServicioGeneral;
import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Ventas logisitica", tags = "Venta logisitica")
public class ControladorGeneral {

	@Autowired
	VwVentasPosRepository vwVentasPosRepository;

	@Autowired
	ServicioGeneral servicioGeneral;
	
	@Autowired
	RepositoryGenerico generico;

	@PostMapping(value = "/ventas_logistica")
	@ApiOperation(tags = "Ventas logisitica", value = "Envío de datos ventas logistica")
	public ResponseEntity<?> vwVentasPos() {
		try {
			String response = "SIN DATOS";
			JsonObject respuesta = new JsonObject();
			/*CONSULTA DE LA BASE*/
			List<VwJdeVentasLogistica> ventas = vwVentasPosRepository.findAll();
			List<String> listaDatos = new ArrayList<String>();
			if (!ventas.isEmpty()) {

				for (VwJdeVentasLogistica items : ventas) {
					/*ENVIO A JDE*/
					response = servicioGeneral.invocarVentasLogistica(items);
					
					/*ENVIO LA RESPUESTA DE JDE AL PROCEDIMIENTO DE LA BASE*/
					respuesta = generico.callStoreProcedureArray("DINAMIC.sp_jsonin_venta_pos", response);
				}

				return new ResponseEntity<>(listaDatos, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(response, HttpStatus.OK);
			}

		} catch (HttpClientErrorException | HttpServerErrorException ex) {
			// Captura excepciones específicas para manejar errores
			System.err.println("Error during API request: " + ex.toString());
		
			// Maneja la respuesta de error aquí
			// Puedes obtener el cuerpo de respuesta de error usando
			// ex.getResponseBodyAsString()
			return ResponseEntity.status(ex.getStatusCode())
					.body(ex.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
