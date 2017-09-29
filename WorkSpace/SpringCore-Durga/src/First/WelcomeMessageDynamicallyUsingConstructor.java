package First;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class WelcomeMessageDynamicallyUsingConstructorBean
{
	String message;

	public String getMessage() {
		return message;
	}

	public WelcomeMessageDynamicallyUsingConstructorBean(String message) {
		this.message = message;
	}
		
}

public class WelcomeMessageDynamicallyUsingConstructor {

	public static void main(String[] args) {
	//java Style
	WelcomeMessageDynamicallyUsingConstructorBean wel=new WelcomeMessageDynamicallyUsingConstructorBean("using constructor");
	System.out.println(wel.getMessage());
	
	//Spring style
	ApplicationContext container=new ClassPathXmlApplicationContext("First/welcomemessagedynamicallyusingconstructor.xml");
	Object object = container.getBean("welcomemessagedynamically");
	WelcomeMessageDynamicallyUsingConstructorBean welcome =(WelcomeMessageDynamicallyUsingConstructorBean)object;
	System.out.println(welcome.getMessage());


	}

}
