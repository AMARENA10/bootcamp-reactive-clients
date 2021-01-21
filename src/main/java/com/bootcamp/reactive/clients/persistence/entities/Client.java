package com.bootcamp.reactive.clients.persistence.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "clients")
public class Client {
	@Id
	private String id;
	private String dni;
	private String name;
	private Integer old;
	private String sex;
	
	public Client() {
		super();
	}
	public Client(String id, String dni, String name, Integer old, String sex) {
		super();
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.old = old;
		this.sex = sex;
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
	
	
	
	
		

}
