package com.taojishu.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServerApplication02 {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServerApplication02.class, args);
	}

}
