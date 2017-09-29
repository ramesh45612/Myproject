package Core;

import javax.swing.plaf.SliderUI;


class MyThread1 implements Runnable
{

boolean stop=false;	
	@Override
	public void run() {
for(int i=0;i<1000000;i++)
{
	System.out.println("values "+i);
	if (stop) return;
	
}
		
		
	}
	
}

public class TerminateThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		MyThread1 ob =new MyThread1();
		Thread ob1=new Thread(ob);
		ob1.start();
		System.in.read();
		ob.stop=true;
		
		

	}

}
