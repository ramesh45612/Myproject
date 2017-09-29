package com.ram;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

class Student {
private String name;


public void setName(String name)
{
	this.name = name;
}

public String getName()
{
	return name;
}


public void displayInfo(){
	System.out.println("Hello: "+name);
}
}

public class Test 
{
public static void main(String[] args) {
	Resource resource=new ClassPathResource("springconfig.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	
	Student stu=(Student)factory.getBean("bean1");
	stu.displayInfo();
}
}