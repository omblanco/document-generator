package com.omblanco.document.generator.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DocumentGeneratorEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentGeneratorEngineApplication.class, args);
	}

}
