package com.ec.pintulac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class JDConsultaUnidadesMedidaFechaHoraItem extends SpringBootServletInitializer {



	public static void main(String[] args) {
		SpringApplication.run(JDConsultaUnidadesMedidaFechaHoraItem.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(JDConsultaUnidadesMedidaFechaHoraItem.class);
	}


}
