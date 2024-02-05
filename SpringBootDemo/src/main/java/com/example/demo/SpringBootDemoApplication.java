package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("Welcome to UCL");
		
		ChampionsLeague ucl = context.getBean(ChampionsLeague.class);
		ucl.displayUCLInfo();
	}

}
