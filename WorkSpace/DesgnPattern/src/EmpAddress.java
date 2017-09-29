
class Emp

{
String name;
Address addr;

public Emp(String name, Address addr) {
	this.name = name;
	this.addr = addr;
}

public void getEmpDetails()
{
	System.out.println(name);
	addr.getCity();
}

}

interface Address
{
public void getCity();

}

class Permanent implements Address
{

	public void getCity() {
		System.out.println("Nirmal");
	}
	
}

class Present implements Address
{

	public void getCity() {
		System.out.println("Hyderabad");
	}

}

class AddressFactory
{
	public Address getInstance(String atype)
	{
		if(atype.equalsIgnoreCase("permanent")) return new Permanent();
		if(atype.equalsIgnoreCase("present")) return new Present();
		return null;
	}
}

public class EmpAddress {
	public static void main(String[] args) {
	AddressFactory adressFactory= new AddressFactory();
	Address perm=adressFactory.getInstance("present");
	Emp sankoji= new Emp("ramesh", perm);
	sankoji.getEmpDetails();
		
	}

}
