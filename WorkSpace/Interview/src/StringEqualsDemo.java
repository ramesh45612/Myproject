
//for content comparison we should override equals() and hashCode() methods as good programmer practice
//below all hashCodes are same.
//in String hashCode is overridden

public class StringEqualsDemo {
	
public static void main(String[] args) {
String s1= new String("sankoji");
String s2=new String("sankoji");
System.out.println("s1 equals s2\t"+s1.equals(s2));

System.out.println("s1 HashCode\t"+s1.hashCode());
System.out.println("s2 HashCode\t"+s2.hashCode());

String s3="sankoji";
String s4="sankoji";
System.out.print("s1==s2\t");
System.out.println(s3==s4);

System.out.println("s3 HashCode\t"+s3.hashCode());
System.out.println("s4 HashCode\t"+s4.hashCode());

//equals hascode and == hashcodes are same
	}

}
