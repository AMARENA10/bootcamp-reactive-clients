package com.bootcamp.reactive.clients.domain.dto;

import com.bootcamp.reactive.clients.persistence.entities.ClientAddress;

public class ClientDto {

	private String id;
	private String dni;
	private String name;
	private Integer old;
	private String sex;
	
	private ClientAddress address;

	
	@Override
	public String toString() {
		return "ClientDto [id=" + id + ", dni=" + dni + ", name=" + name + ", old=" + old + ", sex=" + sex
				+ ", address=" + address + "]";
	}

	public ClientDto() {
		super();
	}

	public ClientDto(String id, String dni, String name, Integer old, String sex, ClientAddress address) {
		super();
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.old = old;
		this.sex = sex;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOld() {
		return old;
	}

	public void setOld(Integer old) {
		this.old = old;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public ClientAddress getAddress() {
		return address;
	}

	public void setAddress(ClientAddress address) {
		this.address = address;
	}
	
}
