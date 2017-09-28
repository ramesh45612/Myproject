package com.ram;

import java.util.List;

public class AccountBuilder {

	private String id;
	private String name;
	private List<Address> address;
	
	public AccountBuilder setId(String id) {
		this.id = id;
		return this;
	}
	public AccountBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public AccountBuilder setAddress(List<Address> address) {
		this.address = address;
		return this;
	}
	
	public Account getAccount(){
		return new Account(id, name, address);
	}
}
