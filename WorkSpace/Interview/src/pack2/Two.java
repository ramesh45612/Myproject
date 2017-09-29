package pack2;

import pack1.First;

class Secure extends First
{
	//need to override the protected method , without overriding protectedMethod we can't access protected method out side
@Override
protected void protectedMethod() {
System.out.println("calling ");
super.protectedMethod();
	}
}

public class Two  
{
	public static void main(String[] args) {
	Secure ob = new Secure();
	ob.protectedMethod();

}

}
