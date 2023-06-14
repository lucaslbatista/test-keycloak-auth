package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	//https://medium.com/geekculture/using-keycloak-with-spring-boot-3-0-376fa9f60e0b
	//docker run --name keyclooak-roles-test -p 8084:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:21.1.1 start-dev

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
