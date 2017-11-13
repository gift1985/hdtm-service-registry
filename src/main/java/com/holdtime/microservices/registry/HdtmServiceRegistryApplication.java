package com.holdtime.microservices.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HdtmServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdtmServiceRegistryApplication.class, args);
	}
}
