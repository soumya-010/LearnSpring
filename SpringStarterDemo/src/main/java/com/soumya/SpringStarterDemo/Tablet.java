package com.soumya.SpringStarterDemo;

public class Tablet implements Phone{
	private int callId;
	private String company;
	
	// constructor
	public Tablet () {
		System.out.println("Constructor :: Tablet");
	}
	
	public Tablet (int callId, String company) {
		this.callId = callId;
		this.company = company;
		System.out.println("Param Constructor :: Tablet");		
	}
	
	// getters and setters
	@Override
	public int getCallId() {
		return callId;
	}

	public void setCallId(int CallId) {
		this.callId = CallId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	// BootUp Function
	void BootUp () {
		System.out.println("Booting Up Tablet");
	}
}
