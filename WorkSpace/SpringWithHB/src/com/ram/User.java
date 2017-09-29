package com.ram;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.Email;
import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.Size;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="SpringHB")
public class User {  
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;  

private String name;

private String mobile;

private String  email;
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User( String name, String mobile, String email) {
	super();
	this.id = id;
	this.name = name;
	this.mobile=mobile;
	this.email = email;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}  
  

}  
