class A
{
	public String toString()
	{
	return "from A";
	}
}

class B extends A
{

	public String toString()
	{
	return "from B";
	}
}

public class Teradata {

	public static void method(Exception e)
	{
	System.out.println("From Exception");
	}
	
	public static void method(ArithmeticException e)
	{
		System.out.println("From Arithmetic Exception");
	}
		
	public static void main(String[] args) {
	method(null);
	A ob = new A();
	System.out.println(ob.toString());

	}

}


