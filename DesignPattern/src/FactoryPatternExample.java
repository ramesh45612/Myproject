/**
 * 
 * Vehicle.java
 * Interface class that has the following methods.
 * 
 * @author Ramesh
 * @since 07-05-2017
 */
interface Vehicle{	
	void drive();
}

class Bus implements Vehicle{
	@Override
	public void drive() {
		System.out.println("driving Bus");
		
	}
	
}

class Bike implements Vehicle{
	@Override
	public void drive() {
		System.out.println("driving bike");
	}
}

class VehicleFactory{
	public Vehicle getInstance(String str){
		if(str.equals("bus"))
			return new Bus();
		else 
			return new Bike();
	}
}

public class FactoryPatternExample {
	public static void main(String[] args) {
		/*without using factory pattern*/
		System.out.println("without using factory pattern");
		Vehicle bus = new Bus();
		bus.drive();	//bus
		Vehicle bike = new Bike();
		bike.drive();	//bike
		
		System.out.println("using factory pattern");


		//above logic maintained by third party  
		VehicleFactory vf= new VehicleFactory();
		//created a class using factory design pattern  - VehicleFactory
		//some body else creating object that is Factory
		//instead of you are crating some one is creating 
		System.out.println("created below object using factory pattern");
		Vehicle vehicle=vf.getInstance("bus");
		vehicle.drive();
		
		
	}

}
