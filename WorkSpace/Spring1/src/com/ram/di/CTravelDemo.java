
//Example On Spring Dependency In The Form Of Objects constructor based dependancy injection

package com.ram.di;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//interfaces are journey and vehicle are taking from NewTravelDemo

class Travel2 implements Journey1
{

	private Vehicle1 v;
	   /*public void setV(Vehicle1 v)
	   {
	       this.v = v;
	   }*/
	 
		Travel2(Vehicle1 v)
		{
		this.v=v;
		}
	   public void startJourney()
	   {
	      System.out.println("Journey been started....");
	      v.move();
	   }
	
}

class Car2 implements Vehicle1{
	 
	private String fuelType;
	private int maxSpeed;
 
/*	public String getFuelType() {
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
	}	*/
 
	Car2(String fuelType,int maxSpeed)
	{
		this.fuelType=fuelType;
		this.maxSpeed=maxSpeed;
	}
	public void move()
	{
		System.out.println("Fuel type :" +fuelType);
		System.out.println("max speed :" +maxSpeed);
		System.out.println("car started....");
	}
 
}

class Bus2 implements Vehicle1{
	 
	private int maxSpeed;	
 
	/*public int getMaxSpeed() {
		return maxSpeed;
	}
 
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}	
*/
	Bus2(int maxSpeed)
	{
		this.maxSpeed=maxSpeed;
	}
	public void move()
	{
		System.out.println("max speed :" +maxSpeed);
		System.out.println("Bus started....");
	}
 
}

public class CTravelDemo {

	public static void main(String[] args) {
	

		 /*Resource r=new ClassPathResource("travel1.xml");  
		 BeanFactory factory=new XmlBeanFactory(r);  
		*/
		 
		ApplicationContext factory=new ClassPathXmlApplicationContext("travel1.xml");
			Journey1 j=(Journey1)factory.getBean("id6");
			j.startJourney();  
		  
		
	}

}
