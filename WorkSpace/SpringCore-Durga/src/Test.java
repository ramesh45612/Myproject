import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class First
{
	String email;
	String name;
	int age;
	String address[];

	public First(String email,String name,int age,String[] address) {
		//super();
		this.email = email;
		this.name=name;
		this.age=age;
		this.address=address;
	}
	

	public String getMessage() {
	return name+"\t"+email+"\t"+age+"\t"+address[0]+","+address[1]+","+address[2];
	}
/*
	public void setMessage(String message) {
		this.message = message;
	}*/
	
	
	
	
}

public class Test {

	
	public static void main(String[] args) {
	
		ApplicationContext container = new ClassPathXmlApplicationContext("first.xml");
		Object ob=container.getBean("first");
		First first =(First) ob;
		System.out.println(first.getMessage());				
	}

}
