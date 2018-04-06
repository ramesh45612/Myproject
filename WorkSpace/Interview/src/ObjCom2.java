
class C
{
	D d;
	C(D d)
	{
		this.d=d;
		d.dis();
		System.out.println("D instance var"+d.a);
	}
	
	public void method()
	{
		d.dis();
		//without of above constructor you wil get null pointer exception, constructor should be there to initialize
	}
}

class D
{
	int a;
	public void dis()
	{
	
		System.out.println("From D");
	}
	
}


public class ObjCom2 {
	
	public static void main(String[] args) {
		D d=new D();
		d.a=20;
		C ob = new C(d);
		ob.method();
		
	}

}
