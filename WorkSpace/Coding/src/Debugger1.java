import java.io.*;
class Demo
{
	public int div(int a, int b)
	{
		System.out.println("the division is");
		
		return a/b;
	}
}

public class Debugger1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println("Enter A value");
		int a=Integer.parseInt(br.readLine());
		
		System.out.println("Enter B value");
		int b=Integer.parseInt(br.readLine());
		
		Demo ob = new Demo();
		int c=ob.div(a,b);
		System.out.println(c);
/*		System.out.println(ob.div(5, 0));
*/
	}

}
