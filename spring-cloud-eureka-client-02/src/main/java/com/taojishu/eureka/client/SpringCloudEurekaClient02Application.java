package com.taojishu.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaClient02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClient02Application.class, args);
	}

}
