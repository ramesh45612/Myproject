package First;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class WelcomeMessageDynamicallyBean
{
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/*public WelcomeMessageDynamicallyBean(String message) {
		this.message = message;
	}*/
	
	
}

public class WelcomeMessageDynamically {

	public static void main(String[] args) {
	//java Style
	WelcomeMessageDynamicallyBean welcome=new WelcomeMessageDynamicallyBean();
	// we can resolve by adding param
	//	WelcomeMessageDynamicallyBean welcome=new WelcomeMessageDynamicallyBean("setter DI spring use default constructor not param");
		welcome.setMessage("Welcome to Spring 123");
	System.out.println(welcome.getMessage());
	
	//Spring style
	
	ApplicationContext container=new ClassPathXmlApplicationContext("First/welcomemessagedynamically.xml");
	Object object = container.getBean("welcomemessagedynamically");
	/*if we have no- arg constructor in bean will get exception like Could not instantiate bean class [First.WelcomeMessageDynamicallyBean]:
	No default constructor found;*/
	WelcomeMessageDynamicallyBean wel =(WelcomeMessageDynamicallyBean)object;
	System.out.println(wel.getMessage());

	}

}
