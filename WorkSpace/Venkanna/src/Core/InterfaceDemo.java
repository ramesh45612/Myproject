package Core;

interface One
{
	String name="One";
	void methodOne();
}

class Imp1 implements One
{

	//String name="over";
	public void methodOne() {
		
		System.out.println("method One\t"+name);
		
	}
	
}

public class InterfaceDemo {
	
	public static void main(String[] args) {
	String name="InterfaceDemo";
	One ob =new Imp1();
	ob.methodOne();
	}
	
		
}