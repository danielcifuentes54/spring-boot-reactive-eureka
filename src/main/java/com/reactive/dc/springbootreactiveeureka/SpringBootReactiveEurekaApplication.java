package com.reactive.dc.springbootreactiveeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootReactiveEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactiveEurekaApplication.class, args);
	}

}
