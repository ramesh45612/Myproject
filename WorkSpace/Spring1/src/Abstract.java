import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 class HelloWorld {
   private String name;
   private String city;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
 

}

public class Abstract {
	
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("abstract.xml");

	      HelloWorld sankoji = (HelloWorld) context.getBean("sankoji");

	      System.out.println(sankoji.getName());
	      System.out.println(sankoji.getCity());
	}

}
