package com.ec.pintulac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurecaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurecaServerApplication.class, args);
	}
	
//	//ServletInitializer.java
//	public class ServletInitializer extends SpringBootServletInitializer {
//
//	    @Override
//	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//	        return application.sources(SpringBootApplication.class);
//	    }
//	}

}
