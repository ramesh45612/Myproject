import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Emp1
{
	private int no;
	private String name;
		public Emp1() {
		System.out.println("from default constructor of Emp1");
	}
}

public class Eager {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("eager.xml");
			}

}
