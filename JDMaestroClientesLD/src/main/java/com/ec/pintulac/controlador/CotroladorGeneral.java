package com.ec.pintulac.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ec.pintulac.entidad.VwCrearActualizaCliente;
import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.repository.VwCreaActualizaClienteRepository;
import com.ec.pintulac.response.MaestroClientesLDResponse;
import com.ec.pintulac.services.ServicioGeneral;
import com.ec.pintulac.utilitario.ParamBusqueda;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api
public class CotroladorGeneral {

	@Autowired
	ServicioGeneral servicioGeneral;

	@Autowired
	RepositoryGenerico generico;

	@Autowired
	VwCreaActualizaClienteRepository actualizaClienteRepository;

	@RequestMapping(value = "/maestro_clientes", method = RequestMethod.POST)
	@ApiOperation(tags = "Maestr de cliente", value = "ESP-INT-OUT-Maestro de clientes")
	public ResponseEntity<?> maestroClientes(@RequestBody Object param) {

		try {

			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;
			JsonObject respuesta = new JsonObject();
//			ExistenciaFisicaResponse JSONJDE = servicioGeneral.invocarJDE(param);

//			for (Row item : JSONJDE.getConnectorRequest1().getRows()) {
			Gson gson = new Gson();
			String JSON = gson.toJson(param);
			respuesta = generico.callStoreProcedureArray("DINAMIC.sp_jsonin_out_maestro_cliente", JSON);
			System.out.println(i++ + ": " + respuesta);
//			}
			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
			return new ResponseEntity<String>(respuesta==null ?"VALOR NULO DEL PROCEDIMIENTO": respuesta.toString(), HttpStatus.OK);
//			

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

	@RequestMapping(value = "/creacion_actualizacion_clientes", method = RequestMethod.POST)
	@ApiOperation(tags = "Maestro de clientes ", value = "Creacion y actualizacion de clientes INT IN")
	public ResponseEntity<?> creaciobActualizacionCliente(@RequestBody ParamBusqueda param) {

		try {
			List<VwCrearActualizaCliente> datos = actualizaClienteRepository.buscarPorRuc(param.getBusqueda());
			String valorRes ="";
			for (VwCrearActualizaCliente items : datos) {
				Gson gson = new Gson();
				String JSON = gson.toJson(items);

				System.out.println("KIT ENVIADO  " + JSON);

				valorRes= servicioGeneral.invocarCreaActualizaCliente(items);
				
				//con la respuesta ejecutar sp_jsonin_crea_actu_clien 
				System.out.println("EJECUTA KIT  " + valorRes);
			}

			return new ResponseEntity<String>(valorRes.toString(), HttpStatus.OK);
//			

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

}
