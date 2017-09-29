package Core;

// Type 1 Communication -start
class A
{
	public void methodOne()
	{
		System.out.println("from methodOne");
	}
}

class B

{
	
	A ob = new A();
	public void methodTwo()
	{
		ob.methodOne();
	}
	
}

//type 1 communication End


public class ObjCom1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B ob = new B();
		ob.methodTwo();

	}

}
