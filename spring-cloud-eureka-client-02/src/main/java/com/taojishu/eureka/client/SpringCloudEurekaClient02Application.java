package com.taojishu.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaClient02Application {

	@Autowired
	private RestTemplateBuilder builder;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClient02Application.class, args);
	}

	//注入restTemplate
	@Bean
	public RestTemplate restTemplate() {
		return builder.build();
	}

}
