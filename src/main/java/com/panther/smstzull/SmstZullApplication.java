package com.panther.smstzull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SmstZullApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmstZullApplication.class, args);
	}

}
