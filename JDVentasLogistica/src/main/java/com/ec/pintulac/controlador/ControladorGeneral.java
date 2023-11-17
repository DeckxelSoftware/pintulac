package com.ec.pintulac.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.ec.pintulac.entidad.VwJdeVentaKit;
import com.ec.pintulac.entidad.VwJdeVentasLogistica;
import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.repository.VwCrearOrderTransferenciaLogisticaRepository;
import com.ec.pintulac.repository.VwJdeVentaKitRepository;
import com.ec.pintulac.services.ServicioGeneral;
import com.ec.pintulac.utilitario.ParamVentaLogistica;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Ventas logisitica", tags = "Venta logisitica")
public class ControladorGeneral {

	@Autowired
	VwCrearOrderTransferenciaLogisticaRepository vwCrearOrderTransferenciaLogisticaRepository;
	@Autowired
	VwJdeVentaKitRepository jdeVentaKitRepository;

	@Autowired
	RepositoryGenerico generico;

	@Autowired
	ServicioGeneral servicioGeneral;
//
//	@PostMapping(value = "/crear_orden_transferencia_logistica_kit")
//	@ApiOperation(tags = "Crear orden Transferencia logistica kit", value = "Crear orden Transferencia logistica kit")
//	public ResponseEntity<?> vwVentasPosKit(@RequestBody ParamVentaLogistica prod) {
//		try {
//			/* Envia la informacion de los kits */
//			List<VwJdeVentaKit> datosKit = jdeVentaKitRepository.buscarPorNumeroFactura(prod.getNumeroFactura());
//			for (VwJdeVentaKit items : datosKit) {
//				Gson gson = new Gson();
//				String JSON = gson.toJson(items);
//				
//				System.out.println("KIT ENVIADO  " + JSON);
//				
//				
//				String valorRes = servicioGeneral.invocarVentaKit(items);
//				System.out.println("EJECUTA KIT  " + valorRes);
//			}
//
//			/* ejecuta el procedimiento desgloce de descuentos */
//			JsonObject respuesta = new JsonObject();
//			//respuesta = generico.callStoreProcedure("DINAMIC.sp_desglose_descuento", prod.getNumeroFactura());
//
//			Object response = "SIN DATOS";
//			List<VwJdeVentasLogistica> datos = vwCrearOrderTransferenciaLogisticaRepository
//					.buscarPorNumeroFactura(prod.getNumeroFactura());
//
//			List<String> listaDatos = new ArrayList<String>();
//			if (!datos.isEmpty()) {
//
//				for (VwJdeVentasLogistica items : datos) {
//
//					response = servicioGeneral.invocarVentasPos(items);
//				}
//
//				return new ResponseEntity<>(response, HttpStatus.OK);
//			} else {
//				return new ResponseEntity<>(response, HttpStatus.OK);
//			}
//
//		} catch (HttpClientErrorException | HttpServerErrorException ex) {
//
//			System.err.println("Error during API request: " + ex.getMessage());
//
//			return ResponseEntity.status(ex.getStatusCode())
//					.body("Por favor revise los datos ingresados" + ResponseEntity.status(500));
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			return null;
//		}
//	}
//	
	
	@PostMapping(value = "/crear_orden_transferencia_logistica")
	@ApiOperation(tags = "Crear orden Transferencia logistica", value = "Crear orden Transferencia logistica")
	public ResponseEntity<?> vwVentasPos(@RequestBody ParamVentaLogistica prod) {
		try {
			
			/* ejecuta el procedimiento desgloce de descuentos */
			JsonObject respuesta = new JsonObject();
			respuesta = generico.callStoreProcedure("DINAMIC.sp_desglose_descuento");

				
			/* Envia la informacion de los kits */
//			List<VwJdeVentaKit> datosKit = jdeVentaKitRepository.findAll();
//			for (VwJdeVentaKit items : datosKit) {
//				Gson gson = new Gson();
//				String JSON = gson.toJson(items);
//				
//				System.out.println("KIT ENVIADO  " + JSON);
//				
//				
//				String valorRes = servicioGeneral.invocarVentaKit(items);
//				System.out.println("EJECUTA KIT  " + valorRes);
//			}

			
			Object response = "SIN DATOS";
//			List<VwJdeVentasLogistica> datos = vwCrearOrderTransferenciaLogisticaRepository
//					.buscarPorNumeroFactura(prod.getNumeroFactura());
			List<VwJdeVentasLogistica> datos = vwCrearOrderTransferenciaLogisticaRepository.findAll();

			List<String> listaDatos = new ArrayList<String>();
			if (!datos.isEmpty()) {

				for (VwJdeVentasLogistica items : datos) {

					response = servicioGeneral.invocarVentasPos(items);
					generico.update(items.getEMCODIGO(), items.getSUCODIGO(), items.getBOCODIGO(), items.getESCODIGO(), items.getNumero());
				}
				
				return new ResponseEntity<>(response, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(response, HttpStatus.OK);
			}

		} catch (HttpClientErrorException | HttpServerErrorException ex) {

			System.err.println("Error during API request: " + ex.getMessage());

			return ResponseEntity.status(ex.getStatusCode())
					.body("Por favor revise los datos ingresados" + ResponseEntity.status(500));
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
