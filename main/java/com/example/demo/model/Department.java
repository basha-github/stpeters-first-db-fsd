package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {
	
	int id;
	@Id
	String dName;
	String dHead;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String dName, String dHead) {
		super();
		this.id = id;
		this.dName = dName;
		this.dHead = dHead;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdHead() {
		return dHead;
	}
	public void setdHead(String dHead) {
		this.dHead = dHead;
	}
	
	
	
	

}
