package com.netflix.tp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TpApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpApplication.class, args);
	}

}
