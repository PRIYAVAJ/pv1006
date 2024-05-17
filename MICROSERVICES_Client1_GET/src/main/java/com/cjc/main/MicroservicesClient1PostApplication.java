package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicesClient1PostApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesClient1PostApplication.class, args);
	}

}
