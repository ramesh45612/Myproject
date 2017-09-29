package pack2;

import pack1.First;

public class ProtectedDemo  extends First{
	
public static void main(String[] args) {

System.out.println("From Methods object, we can access onlly public methods not protected");
First ob = new First();
ob.publicMethod();

System.out.println("From ProtectedDemo object");
ProtectedDemo pr= new ProtectedDemo();
pr.publicMethod();
pr.protectedMethod();

}
}
