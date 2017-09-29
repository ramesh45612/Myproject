//within single class also we can apply 

package component;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ComponentExampleWithIn {

	public void details()
	{
		System.out.println("with in class also it will create an object");
	}
	
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("component/comp.xml");
		//ComponentExampleWithIn comp=(ComponentExampleWithIn) container.getBean(ComponentExampleWithIn.class);
		ComponentExampleWithIn comp=(ComponentExampleWithIn) container.getBean("componentExampleWithIn");
		comp.details();

	}

}
