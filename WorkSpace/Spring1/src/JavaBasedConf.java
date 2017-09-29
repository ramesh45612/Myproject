import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class HelloConf
{
	@Bean
	public Hello hello()
	{
		return new Hello();
	}
	
}

class Hello
{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
public class JavaBasedConf
{
	public static void main(String[] args) {
	
	ApplicationContext cont=new AnnotationConfigApplicationContext("HelloConf.class");
	Hello hello=(Hello)cont.getBean("Hello.class");
	System.out.println(hello.getMessage());
		
	}
}
