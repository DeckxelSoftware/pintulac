package com.ec.pintulac.controlador;

import java.util.Base64;
import java.util.List;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.ec.pintulac.entidad.VwJdeVentasPos;
import com.ec.pintulac.repository.VwVentasPosRepository;
import com.ec.pintulac.services.ServicioGeneral;
import com.ec.pintulac.utilitario.TiempoEjecucion;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Consumo de Ordenes de Unidades de Negocio", tags = "Unidades de Negocio")
public class CotroladorGeneral {

	@Autowired
	VwVentasPosRepository vwVentasPosRepository;
	@Autowired
	ServicioGeneral servicioGeneral;

	@Value("${movil.vendor.login}")
	private String ruta;

	@PostMapping(value = "/ventas_pos")
	@ApiOperation(tags = "Ventas pos", value = "Envio de datos ventas pos")
	public ResponseEntity<?> vwVentasPos() {
		try {
			String response = "SIN DATOS";
			List<VwJdeVentasPos> ventas = vwVentasPosRepository.findAll();
			if (!ventas.isEmpty()) {

				response = servicioGeneral.invocerVwVentasPos(ventas.get(0));
			}

			return new ResponseEntity<String>(response, HttpStatus.OK);
		}

		catch (HttpClientErrorException | HttpServerErrorException ex) {
			// Catch specific exceptions for handling errors
			System.err.println("Error during API request: " + ex.getMessage());
			// Handle the error response here
			// You can get the error response body using ex.getResponseBodyAsString()
			return ResponseEntity.status(ex.getStatusCode())
					.body("Por favor revise los datos ingresados" + ResponseEntity.status(400));
		}catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

}
