package com.omblanco.document.generator.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DocumentGeneratorStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentGeneratorStoreApplication.class, args);
	}

}
