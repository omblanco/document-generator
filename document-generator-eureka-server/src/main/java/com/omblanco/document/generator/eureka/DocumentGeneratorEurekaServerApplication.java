package com.omblanco.document.generator.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DocumentGeneratorEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentGeneratorEurekaServerApplication.class, args);
	}

}
