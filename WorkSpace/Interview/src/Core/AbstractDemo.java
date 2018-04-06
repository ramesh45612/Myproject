package Core;


strictfp class BB
{
	
}

abstract class Abs1
{
	
	
	int a;
static
{
System.out.println("Abstract class can have static methods also");
}
abstract void abstractMethod();
public void concreteMethod()
{
System.out.println("Abstract class can have abstract methods as well as concrete methods");
}
public Abs1()
{
System.out.println("Abstract class can have constructor");
	
}
}

abstract  class Abs2 extends Abs1
{
	
void normalMethod()
{
System.out.println("Abstrac Class can only have normal methods or only abstract methods");
}
}

class Imp extends Abs2
{
		void abstractMethod() {
			
		System.out.println("extended class should be implemented all the abstract methods of parent class ");
}
	
}

public class AbstractDemo
{
	public static void main(String[] args) {
		Abs2 ob = new Imp();
		ob.abstractMethod();
		ob.concreteMethod();
		ob.normalMethod();
		System.out.println("abstract class can't be instanciated mean's we can't create a object for abstract class");
		System.out.println("abstract class can't  be final, it should be inherited");
	}
}