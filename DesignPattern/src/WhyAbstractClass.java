//abstract is like template
abstract class Test{

	void show(){
		System.out.println("From Test");
	}
	
}

public class WhyAbstractClass {

	public static void main(String[] args) {
	
	/*	Test ob = new Test(){
			void show(){
				System.out.println("hi How are you");
				}
		};
			ob.show();
	}*/
		
	Test ob1= new Test(){};
	ob1.show();			//from Test
	/*That is NOT an object of abstract class or interface. 
	That is an anonymous class extending(implementing)
	said abstract class(interface). Huge conceptual difference.
	No, we can't create . What we can do is, create an anonymous class 
	(that's the third file) and instantiate it.


	*
	*/
	
	
	}
}
