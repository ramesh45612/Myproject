package beanproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Base
{
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Child
{
	String name;
	String city;
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
public class First {

	public static void main(String[] args) {
	ApplicationContext ap= new ClassPathXmlApplicationContext("beanproperties/first.xml");
	Child c= (Child)ap.getBean("child");
	System.out.println(c.getName());
	System.out.println(c.getCity());
		
	}

}
