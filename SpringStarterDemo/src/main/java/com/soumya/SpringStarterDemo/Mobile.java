package com.soumya.SpringStarterDemo;

public class Mobile implements Phone {
	
	private int callId;
	private String company;
	// private Tablet tab =  new Tablet(); //Want Spring to Manage this instead
	private Phone tab;
	
	// constructor
	public Mobile () {
		System.out.println("Constructor :: Mobile");
	}
	
	public Mobile (int callId, String company, Phone tab) {
		System.out.println("Param Constructor :: Mobile");
		this.callId = callId;
		this.company = company;
		this.tab = tab;
	}
	
	// getters and setters
	@Override
	public int getCallId() {
		return callId;
	}

	public void setCallId(int mobId) {
		this.callId = mobId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
	 public Phone getTab() { return tab; }
	  
	 public void setTab(Phone tab) { this.tab = tab; }
	 

	// display
	void display () {
		System.out.println(this.callId + " - " + this.company + " - " + this.tab.getCallId() + " - " + this.tab.getCompany());
	}
	// BootUp Function
	void BootUp () {
		System.out.println("Booting Up Mobile");
	}
}
