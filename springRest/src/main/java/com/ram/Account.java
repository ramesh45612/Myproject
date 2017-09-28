package com.ram;

import java.util.List;

public class Account {
	
	private String id;
	private String name;
	private List<Address> address;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String id, String name, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<Address> getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
		
}
