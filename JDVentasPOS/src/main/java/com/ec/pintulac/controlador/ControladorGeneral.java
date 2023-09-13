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

import com.ec.pintulac.entidad.VwJdeVentasPos;
import com.ec.pintulac.repository.VwVentasPosRepository;
import com.ec.pintulac.services.ServicioGeneral;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "venta pos", tags = "venta pos")
public class ControladorGeneral {

	@Autowired
	VwVentasPosRepository vwVentasPosRepository;

	@Autowired
	ServicioGeneral servicioGeneral;

	@PostMapping(value = "/ventas_pos")
	@ApiOperation(tags = "Ventas pos", value = "Envío de datos ventas pos")
	public ResponseEntity<?> vwVentasPos() {
		try {
			String response = "SIN DATOS";
			List<VwJdeVentasPos> ventas = vwVentasPosRepository.findAll();
			List<String> listaDatos = new ArrayList<String>();
			if (!ventas.isEmpty()) {

				for (VwJdeVentasPos items : ventas) {
					listaDatos.add(items.getXxx());
				}

				return new ResponseEntity<>(listaDatos, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(response, HttpStatus.OK);
			}

		} catch (HttpClientErrorException | HttpServerErrorException ex) {
			// Captura excepciones específicas para manejar errores
			System.err.println("Error during API request: " + ex.getMessage());
			// Maneja la respuesta de error aquí
			// Puedes obtener el cuerpo de respuesta de error usando
			// ex.getResponseBodyAsString()
			return ResponseEntity.status(ex.getStatusCode())
					.body("Por favor revise los datos ingresados" + ResponseEntity.status(400));
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
