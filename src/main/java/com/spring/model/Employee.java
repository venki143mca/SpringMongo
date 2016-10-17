package com.spring.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employee")
public class Employee implements Serializable{
	
	@Id
	private Integer  id;
	private String name;
	private String company;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Employee( String name, String company) {
		this.name = name;
		this.company = company;
	}
	public Employee() {
	super();
	}
	public Employee(Integer i, String name, String company) {
		super();
		this.id = i;
		this.name = name;
		this.company = company;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
