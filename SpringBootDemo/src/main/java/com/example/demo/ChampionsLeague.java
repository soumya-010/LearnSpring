package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChampionsLeague {
	
	@Value("2024")
	private int season;
	
	
	private Club club;
	
	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public Club getClub() {
		return club;
	}
	
	@Autowired
	public void setClub(Club club) {
		this.club = club;
	}

	public void displayUCLInfo() {
		System.out.print("Welcome to UCL:" + this.season + " from ");
		club.anthem();
	}
}
