
public class Current
{		public static void main(String[] args) throws Exception{
		System.out.println("lets find out what is Current Thread");
		Thread t=Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		System.out.println(t.getThreadGroup());
		t.sleep(1000);
		System.out.println(t.getState());
		}
}