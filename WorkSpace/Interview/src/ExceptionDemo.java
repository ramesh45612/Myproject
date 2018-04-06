public class ExceptionDemo {
	public static void main(String[] args) {

		try
		{
			System.out.println("everthin is possible");
			int a=10,b=0,c=a/b;
			System.out.println(c);
			
			int d[]={1,2};
			System.out.println(d[3]);
			
			System.out.println("rest of the code");
						
		}  
				
		
		catch(ArithmeticException ae)
		{
			System.out.println("AE");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("AIBE");
		}
		}

}
