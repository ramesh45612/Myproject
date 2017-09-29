  //not required an xml configuration file it is spring java based configurations
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface Person2
{
	public String comeToOffice();
	public String doWork();

}

interface Vehicle2
{
	public String move();
}

interface Computer2
{
	public String startSystem();
	public String sendMail();
}


class ItEmployee2 implements Person2
{
	Vehicle2 vehicle;
	Computer2 computer; 

	@Required	//optional here
	@Autowired(required=false)
	@Qualifier("bus")
	public void setVehicle(Vehicle2 vehicle) {
		this.vehicle = vehicle;
	}

	@Required   //optional here
	@Autowired(required=false)
	@Qualifier("laptop")
	public void setComputer(Computer2 computer) {
		this.computer = computer;
	}


	

	public String comeToOffice() {
		String come=vehicle.move();
		return come;
	}
	
	public String doWork() {
		String startSystem=	computer.startSystem();
		String sendMail=computer.sendMail();
		
		return (startSystem+sendMail);
	}
}

class Bus2 implements Vehicle2
{
	public String move() {
		return "Coming to Office by Bus";
	}

}

class Car2 implements Vehicle2
{

	@Override
	public String move() {
		
		return "coming to office by Car";
	}
	
}

class Laptop2 implements Computer2
{

	public String startSystem() {
		return "started laptop";
	}

	public String sendMail() {

		return "Sent  mail using laptop";
	}

}


class Desktop2 implements Computer2
{

	public String startSystem() {
		return "started Desktop";
	}

	public String sendMail() {

		return "Sent  mail using desktop";
	}

}


public class RealtimeWithJavaBaseddConf {
	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("realtimewithannotation.xml");
		Person2 person=(Person2)container.getBean("itemployee");
		System.out.println(person.comeToOffice());
		System.out.println(person.doWork());

	}
}

