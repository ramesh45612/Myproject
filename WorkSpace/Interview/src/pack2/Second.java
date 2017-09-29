package pack2;

import pack1.First;

public class Second extends First {

	public static void main(String[] args) {
	First fst= new First();
	//ob.protectedMethod();
	
	Second sec = new Second();
	sec.protectedMethod();

	}

}
