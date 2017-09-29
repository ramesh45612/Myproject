package First;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

class WelcomeBean
{
	public void message()
	{
		System.out.println("Welcome to Spring");
	}
}

public class Welcome {
	public static void main(String[] args) {
		//without Spring
		/*WelcomeBean wb= new WelcomeBean();
		System.out.println("Regular Program java Style");
		wb.messag2e();
	*/
			
		Resource res=new ClassPathResource("First/welcome.xml");		
		BeanFactory factory = new XmlBeanFactory(res);		
		System.out.println("Using Spring ");
	
	
		
		System.out.println("Using BeanFactory");
		WelcomeBean wel=(WelcomeBean)factory.getBean("welcomebean");
		wel.message();
		
		System.out.println("Using Application context");
		ApplicationContext container=new ClassPathXmlApplicationContext("First/welcome.xml");
		Object object=container.getBean("welcomebean");
		WelcomeBean  welcomebean=(WelcomeBean)object;
		welcomebean.message();
		
	}

}
