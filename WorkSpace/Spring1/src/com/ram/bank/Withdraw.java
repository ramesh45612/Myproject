//instead of writing different all are written in single class

package com.ram.bank;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ram.di.Employee;

interface Account
{
	public void withdraw();
}

class CurrentAccount implements Account
{
	public void withdraw() {
	System.out.println("amount withdraw from CurrentAccount");
}
	
}

class SavingAccount implements Account
{
	public void withdraw() {
	System.out.println("amount withdraw from SavingAccount");
		
	}
	
}


class Decide 
{
	Account acc;
 
	public Account getAcc() {
		return acc;
	}

	/*
	 * incase of autowire is byName and byType
	 * public void setAcc(Account acc) {
		this.acc = acc;
	}*/
	
	//incase of autowire is constructor
	public Decide(Account acc)
	{
		this.acc=acc;
	} 
	
	public void decideWithdraw()
	{
		acc.withdraw();
	}
}


public class Withdraw {

		
	public static void main(String[] args) {
	 	Resource r=new ClassPathResource("withdraw.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);
	    Decide ac =(Decide)factory.getBean("id3");
	    ac.decideWithdraw();
	 	
	}

}
