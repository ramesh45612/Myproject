//not recommended but we can check like in this way also
//if we override then only true else false
class TestNotRecomended
{
	String name;

	public TestNotRecomended(String name) {
		this.name = name;}
	
	@Override
	public String toString() {
		return name;
	}
	
}

public class ToStringDemo {
	public static void main(String[] args) {
	
		TestNotRecomended ob1= new  TestNotRecomended("sankoji");
		TestNotRecomended ob2= new  TestNotRecomended("sankoji");
		String s1=ob1.toString();
		String s2=ob2.toString();
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.hashCode()==s2.hashCode());//true

				
	}

}
