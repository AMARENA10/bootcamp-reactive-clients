package com.bootcamp.reactive.clients.persistence.entities;

public class ClientAddress {
	private String district;
	private String avenue;
	private String number;
	
	
	
	public ClientAddress() {
		super();
	}
	
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAvenue() {
		return avenue;
	}
	public void setAvenue(String avenue) {
		this.avenue = avenue;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}
