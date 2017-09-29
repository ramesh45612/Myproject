
//Example On Spring Dependency In The Form Of Objects


package com.ram.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

interface Journey1
{
	void startJourney();
}

interface Vehicle1
{
    void move();
}

class Travel1 implements Journey1
{

	private Vehicle1 v;
	   public void setV(Vehicle1 v)
	   {
	       this.v = v;
	   }
	 
	   public void startJourney()
	   {
	      System.out.println("Journey been started....");
	      v.move();
	   }
	
}

class Car1 implements Vehicle1{
	 
	private String fuelType;
	private int maxSpeed;
 
	public String getFuelType() {
		return fuelType;
	}
 
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
 
	public int getMaxSpeed() {
		return maxSpeed;
	}
 
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}	
 
	public void move()
	{
		System.out.println("Fuel type :" +fuelType);
		System.out.println("max speed :" +maxSpeed);
		System.out.println("car started....");
	}
 
}

class Bus1 implements Vehicle1{
	 
	private int maxSpeed;	
 
	public int getMaxSpeed() {
		return maxSpeed;
	}
 
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}	
 
	public void move()
	{
		System.out.println("max speed :" +maxSpeed);
		System.out.println("Bus started....");
	}
 
}

public class NewTravelDemo {

	public static void main(String[] args) {
	

		 /*Resource r=new ClassPathResource("travel1.xml");  
		 BeanFactory factory=new XmlBeanFactory(r);  
		*/
		 
		ApplicationContext factory=new ClassPathXmlApplicationContext("travel1.xml");
			Journey1 j=(Journey1)factory.getBean("id3");
			j.startJourney();  
		  
		
	}

}
