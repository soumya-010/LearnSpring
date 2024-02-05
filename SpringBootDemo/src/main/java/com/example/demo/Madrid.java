package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Madrid implements Club{
	String name = "Real Madrid";
	
	@Override
	public void anthem() {
		System.out.println(name + " ! Hala Madrid!");
	}
}
