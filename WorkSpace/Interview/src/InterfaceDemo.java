
interface One2
{
	String name="One";
	void methodOne();
}

class Imp1 implements One2
{

	//String name="over";
	public void methodOne() {
		
		System.out.println("method One\t"+name);
		
	}
	
}

public class InterfaceDemo {
	
	public static void main(String[] args) {
	String name="InterfaceDemo";
	One2 ob =new Imp1();
	ob.methodOne();
	}
	
		
}