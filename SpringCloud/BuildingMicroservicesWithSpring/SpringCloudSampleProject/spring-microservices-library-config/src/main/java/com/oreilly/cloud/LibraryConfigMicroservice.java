package com.oreilly.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LibraryConfigMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(LibraryConfigMicroservice.class, args);
	}
}