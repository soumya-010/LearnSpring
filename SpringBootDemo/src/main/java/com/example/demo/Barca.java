package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Barca implements Club {
	private String name = "Barcelona";

	@Override
	public void anthem() {
		System.out.println(name + "! Mes Que En Club! ");
	}
}
