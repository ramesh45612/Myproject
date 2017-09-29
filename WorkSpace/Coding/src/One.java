class Business
{
	int sum(int a, int b) throws Exception
	{
		int c;
		System.out.println(a);
		c=a/b;
		return c;
	}
}


public class One {
	public static void main(String[] args)  throws Exception{
		Business ob = new Business();
		int a=ob.sum(10, 0);
		System.out.println(a);
		

	}

}
