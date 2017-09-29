import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class One
{
	
	int a[];

	public One(int[] a) {
			this.a = a;
	}
	
	
	public void getData()
	{
		for(int b:a)
		System.out.println(b);
	}
}


public class ArrayInjection {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("one.xml");
		Object ob=container.getBean("one");
		One one =(One) ob;
		one.getData();
	
	}

}
