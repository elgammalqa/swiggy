package com.swiggy.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAutoConfiguration
@ComponentScan("com.swiggy")
@EnableAsync
public class SwiggyApp {

	public static void main(String[] args) {
		SpringApplication.run(SwiggyApp.class, args);

	}

}
