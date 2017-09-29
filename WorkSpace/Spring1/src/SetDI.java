import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




class Welcome
{
	Set studentdata;

	
	public Welcome(Set studentdata) {
		this.studentdata = studentdata;
	}
 
	public Set getStudentdata() {
		return studentdata;
	}

	/*
	 //in case of setter dependency injection
	 public void setStudentdata(Set studentdata) {
		this.studentdata = studentdata;
	}
	*/
	
	
	
}


public class SetDI {

	
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("travel1.xml");
		 Welcome wel=(Welcome)factory.getBean("set");
		 
	/*wel.show();  */
	System.out.println(""+wel.getStudentdata());

	}

}
