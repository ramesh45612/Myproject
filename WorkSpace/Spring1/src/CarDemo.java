import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
class Car
{
	@Autowired
	private Engine engine;
	
	public void printData()
	{
		System.out.println(engine.getName());
		
	}
}

class Engine
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class CarDemo {
	public static void main(String[] args) {
ApplicationContext con= new ClassPathXmlApplicationContext("Car.class");

Car ob =(Car)con.getBean("car");

ob.printData();

	}

}
