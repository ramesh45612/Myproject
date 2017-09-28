package com.ram;

public class DropDown {
	
	private String ID;
	private  String name;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DropDown(String iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	public DropDown() {
		// TODO Auto-generated constructor stub
	}

}
