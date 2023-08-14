package com.ec.pintulac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.services.ServicioGeneral;

@EnableScheduling
@SpringBootApplication
public class JDDireccionesApplication extends SpringBootServletInitializer {

	@Autowired
	ServicioGeneral servicioGeneral;
	@Autowired
	RepositoryGenerico generico;

	public static void main(String[] args) {
		SpringApplication.run(JDDireccionesApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(JDDireccionesApplication.class);
	}

//	@Scheduled(fixedRate = 1 * 60 * 1000)
//	public void tareaProcesaDescuentoUno() {
//		try {
//			
//			ExistenciaFisicaRequest param= new ExistenciaFisicaRequest();
//			param.setCode_Agencia("");
//			param.setCode_Sku("");
//			param.setFecha_Actualizacion("");
//			param.setHora("");
//			
//			String JSON = servicioGeneral.invocarJDE(param);
//			JsonObject respuesta = generico.callStoreProcedure("DINAMIC.sp_json3_existencia", JSON);
//			System.out.println("respuesta " + respuesta);
//
////			
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//
//		}
//	}

}
