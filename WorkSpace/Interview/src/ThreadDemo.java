
class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("one\t"+(Thread.currentThread().getName()));
    }
}

class Thread2 implements Runnable{
    
    @Override
    public void run() {
        System.out.println("two"+(Thread.currentThread().getName()));
    }
}



public class ThreadDemo {
    public static   void main(String[] args) {
       /* try {
            Thread.currentThread().sleep(2000);
            System.out.println("once sleeping completed i will execute");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       */ 
        Thread1 t1 = new Thread1();
        Thread t2 = new Thread(new Thread2());
        System.out.println(t1.getName()+"\t" + t1.getState()); //NEW
        System.out.println(t2.getName()+"\t"+t2.getState()); //NEW
        
        t1.start();
        System.out.println("once started t1 thread");
        System.out.println(t1.getName()+"\t" + t1.getState()); //RUNNABLE
        System.out.println(t2.getName()+"\t"+t2.getState()); //NEW
        
        t2.start();
        System.out.println("once started t2 thread");
        System.out.println(t1.getName()+"\t" + t1.getState()); //RUNNABLE or TERMINATED or BLOCKED
        System.out.println(t2.getName()+"\t"+t2.getState()); //RUNNABLE
        System.out.println(Thread.currentThread().getName());

    }
    
}
