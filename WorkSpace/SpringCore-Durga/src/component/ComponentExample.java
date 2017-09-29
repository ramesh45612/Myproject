package component;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Comp
{	
	public void details()
	{
		System.out.println("container only created me not programmer");
	}
}

public class ComponentExample {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("component/comp.xml");
		String s[]=container.getBeanDefinitionNames();
		Comp comp=(Comp) container.getBean(Comp.class);
		//Comp comp=(Comp) container.getBean("comp");
			comp.details();
		

	}

}
