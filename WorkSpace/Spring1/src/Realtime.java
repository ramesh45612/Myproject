import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface Person
{
public String comeToOffice();
public String doWork();

}

interface Vehicle
{
	public String move();
}

interface Computer
{
public String startSystem();
public String sendMail();
}

interface Telephone
{
	public String call();
	public String message();
}

class ItEmployee implements Person
{
	Vehicle vehicle;
	Computer computer; 
	Telephone telephone;
		
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}
	public String comeToOffice() {
		String come=vehicle.move();
		return come;
	}
	public String doWork() {
	String startSystem=	computer.startSystem();
	String sendMail=computer.sendMail();
	String call=telephone.call();
	String message=telephone.message();
	return (startSystem+sendMail+call+message);
	}
}

class Bus implements Vehicle
{
	public String move() {
	return "Coming to Office by Bus";
	}
	
}

class Laptop implements Computer
{

		public String startSystem() {
		return "started laptop";
	}
	
	public String sendMail() {
		
		return "Send a mail using laptop";
	}
	
}

class Mobile implements Telephone
{

	public String call() {
		return "Calling to user by Mobile";
	}

	public String message() {
		return "sent a message to user by Mobile";
	}
	 
}

class Land implements Telephone
{

	public String call() {
		return "Calling to user by Landline";
	}

	public String message() {
		return "sent a message to user by landline";
	}
	
}

public class Realtime {
	public static void main(String[] args) {
	ApplicationContext container=new ClassPathXmlApplicationContext("realtime.xml");
	Person person=(Person)container.getBean("itemployee");
	System.out.println(person.comeToOffice());
	System.out.println(person.doWork());
	
	}
}

