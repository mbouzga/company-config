package com.bouzga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CompanyPersonneConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyPersonneConfigApplication.class, args);
	}

}
