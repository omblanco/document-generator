package com.omblanco.document.generator.exporter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DocumentGeneratorExporterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentGeneratorExporterApplication.class, args);
	}

}
