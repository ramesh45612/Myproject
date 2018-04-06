
abstract class Bike
{
	String label="Bike";
	
	Bike()
	{
	System.out.println("Bike is Created");
	}
	
	abstract void run();
	
	void changeGear()
	{
	System.out.println("Gear Channged of Bike");
	}
}

 class Honda extends Bike
{

	//String label;
	Honda()
	{
		
	System.out.println("Honda is created");
	}
	@Override
	void run() {
	System.out.println("Runnig from Honda"+label);
		
	}
	
	}

public class AbstractDemo2
{
	public static void main(String[] args) {
	
		Bike ob = new Honda();
		ob.run();
		ob.changeGear();
		
	}
	
	
	
}