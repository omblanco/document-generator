package com.omblanco.document.generator.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DocumentGeneratorGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentGeneratorGatewayApplication.class, args);
	}

}
