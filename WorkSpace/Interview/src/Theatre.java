//example to run Multiple task at a time


/*abstract class B
{
	
}
*/
class MyThread3 implements Runnable
{

	String str;
	public MyThread3( String str) {
	this.str=str;
	}
	@Override
	public void run() {
	
		for(int i=0;i<=10;i++)
		{
			System.out.println("Audience"+i+"\t"+str);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}

public class Theatre {

	public static void main(String[] args) {
	
		MyThread3 ob1=new MyThread3("collecting Tickets");
		MyThread3 ob2=new MyThread3("showing the seat");
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.start();
		t2.start();
		
	}
}
