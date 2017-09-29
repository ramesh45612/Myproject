import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface Person1
{
	public String comeToOffice();
	public String doWork();

}

interface Vehicle1
{
	public String move();
}

interface Computer1
{
	public String startSystem();
	public String sendMail();
}


class ItEmployee1 implements Person1
{
	Vehicle1 vehicle;
	Computer1 computer; 

	@Required	//optional here
	@Autowired(required=false)
	@Qualifier("bus")
	public void setVehicle(Vehicle1 vehicle) {
		this.vehicle = vehicle;
	}

	@Required   //optional here
	@Autowired(required=false)
	@Qualifier("laptop")
	public void setComputer(Computer1 computer) {
		this.computer = computer;
	}


	/*@Autowired
		public ItEmployee1(Vehicle1 vehicle, Computer1 computer) {
		super();
		this.vehicle = vehicle;
		this.computer = computer;
	}*/
	

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

class Bus1 implements Vehicle1
{
	public String move() {
		return "Coming to Office by Bus";
	}

}

class Car1 implements Vehicle1
{

	@Override
	public String move() {
		
		return "coming to office by Car";
	}
	
}

class Laptop1 implements Computer1
{

	public String startSystem() {
		return "started laptop";
	}

	public String sendMail() {

		return "Sent  mail using laptop";
	}

}


class Desktop implements Computer1
{

	public String startSystem() {
		return "started Desktop";
	}

	public String sendMail() {

		return "Sent  mail using desktop";
	}

}


public class RealtimeWithAnnotation {
	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("realtimewithannotation.xml");
		Person1 person=(Person1)container.getBean("itemployee");
		System.out.println(person.comeToOffice());
		System.out.println(person.doWork());

	}
}

