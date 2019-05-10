package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHerokuApplication.class, args);
		/*SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBootHerokuApplication.class);
		 builder.headless(false);
		    ConfigurableApplicationContext context = builder.run(args);*/
	}

}
