package com.ec.pintulac.controlador;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.ec.pintulac.entidad.VwJdeConfirmacionCantidadesRecibir;
import com.ec.pintulac.repository.RepositoryGenerico;

import com.ec.pintulac.repository.VwJDConfirmacionCantidadesRecibirRepository;
import com.ec.pintulac.request.CodigosCategoriaRequest;
import com.ec.pintulac.response.ConnectorRequest1Data;
import com.ec.pintulac.response.CodigosCategoriaResponse;
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
	VwJDConfirmacionCantidadesRecibirRepository vwJDVentaLogisticaFacturacionRepository;

	@Autowired
	ServicioGeneral servicioGeneral;

	@PostMapping(value = "/confirmacion_cantidades_recibir")
	@ApiOperation(tags = "confirmacion_cantidades_recibir", value = "Detallar los elementos que conforman la integración de entrada a JDE para la confirmación de cantidades a recibir por compras y por transferencias logísticas.")
	public ResponseEntity<?> vwVentasPos() {
		try {
			Object response = "SIN DATOS";
			List<VwJdeConfirmacionCantidadesRecibir> ventas = vwJDVentaLogisticaFacturacionRepository.findAll();
		

				for (VwJdeConfirmacionCantidadesRecibir items : ventas) {

					response=	servicioGeneral.invocarVentasPos(items);
					
					

				}

				return new ResponseEntity<>(response, HttpStatus.OK);
		
		} catch (HttpClientErrorException | HttpServerErrorException ex) {
			
			System.err.println("Error during API request: " + ex.getMessage());
			
			return ResponseEntity.status(ex.getStatusCode())
					.body("Por favor revise los datos ingresados" + ResponseEntity.status(400));
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
