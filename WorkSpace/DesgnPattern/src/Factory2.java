
interface Vehicle
{
 
public void	move();
	
}

class Bus implements Vehicle
{

	public void move() {
System.out.println("coming from Bus");
		
	}
	
}

class Bike implements Vehicle
{
	public void move() {
		System.out.println("coming from Bike");
				
			}
	
}

class GetVehiceFactory
{
	public Vehicle getInstance(String vtype)
	{
		if(vtype.equalsIgnoreCase("bike")) return new Bike();
		if(vtype.equalsIgnoreCase("bus")) return new Bus();
		return null;
	}
}

public class Factory2 {
	public static void main(String[] args) {
	GetVehiceFactory vehicleFactory= new GetVehiceFactory();
	Vehicle v=vehicleFactory.getInstance("bus");
	v.move();
	}

}
