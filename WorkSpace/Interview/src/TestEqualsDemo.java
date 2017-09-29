//for content comparison we should override equals() and hashCode() methods as good programmer practice
/*below s1 and s2's hashCodes are same 
 *if we are not overriding hashCode() content is same for s1 and s2  and hash code is different as this worst programming lang
 will not get any compile or run time error 
Rule:if two objects are equal() compulsory hash code must be same
*/
class Test
{
	String name;
	Test(String name){
		this.name=name;
	}
	@Override
	public boolean equals(Object ob) {
		Test t=(Test)ob;
		boolean b=false;
		if(this.name.equals(t.name)) b=true;
		return b;
	}
	@Override
	public int hashCode() {
	return name.hashCode();
			}
	
}
public class TestEqualsDemo {
	
public static void main(String[] args) {
Test s1= new Test("sankoji");
Test s2=new Test("sankoji");
System.out.println("s1 equals s2\t"+s1.equals(s2));

System.out.println("s1 HashCode\t"+s1.hashCode());
System.out.println("s2 HashCode\t"+s2.hashCode());


	}

}
