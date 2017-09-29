
//Example On Spring Dependency In The Form Of Objects


package com.ram.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

interface Journey
{
	void startJourney();
}

interface Vehicle
{
    void move();
}

class Travel implements Journey
{

	private Vehicle v;
	   public void setV(Vehicle v)
	   {
	       this.v = v;
	   }
	 
	   public void startJourney()
	   {
	      System.out.println("Journey been started....");
	      v.move();
	   }
	
}

class Car implements Vehicle{
	 
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

class Bus implements Vehicle{
	 
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

public class TravelDemo {

	public static void main(String[] args) {
	

		 Resource r=new ClassPathResource("travel.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		      
		    BeanFactory factory1=new XmlBeanFactory(r,factory);  
		
		    
		    Journey j=(Journey)factory1.getBean("id3");  
		    j.startJourney();  
		  
		
	}

}
