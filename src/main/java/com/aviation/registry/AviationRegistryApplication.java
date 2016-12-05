package com.aviation.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AviationRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AviationRegistryApplication.class, args);
	}
}
