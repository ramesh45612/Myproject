class Dead extends Thread
{
	
	@Override
	public void run() {
	method1();
	method2();
	}
	
	public void method1()
	{
		synchronized(String.class)
		{
			System.out.println("Acquired lock on String object - method1");
		synchronized(Integer.class)
		{
			System.out.println("Acquired lock of Integer Object - method1");
		}
		}
		
	}
	
	
	
	public void method2()
	{
		
		synchronized(Integer.class)
		{
			System.out.println("Acquired lock on Integer object - method2");
		synchronized(String.class)
		{
			System.out.println("Acquired lock of String Object - method2");
		}
		}
		
	}
}


public class DeadLockDemo {
	public static void main(String[] args) {
Dead d1=new Dead();
Dead d2= new Dead();
d1.start();
d2.start();

	}

}
