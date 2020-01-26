package com.coviam.loadBalancing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@EnableEurekaServer
@SpringBootApplication
public class LoadBalancingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancingApplication.class, args);
	}

}
