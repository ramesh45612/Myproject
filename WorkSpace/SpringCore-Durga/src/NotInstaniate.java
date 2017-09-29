import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class All
{
	String message;

	public All(String message) {
		System.out.println("from single param constructor");
		this.message = message;
	}		
}

public class NotInstaniate {
public static void main(String[] args) {
ApplicationContext container = new ClassPathXmlApplicationContext("notinstaniate.xml");
All one=(All)container.getBean("one");
All two=(All)container.getBean("two");
All three=(All)container.getBean("three");

	}

}
