package threadSnippets;

import java.util.Date;

class One extends Thread{
    public static void task1(){
        String message = "Starting task -1 ";
        System.out.println(message);
        try {
            
            //System.out.println(currentThread().getName()+"\t"+currentThread().getState());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         System.out.println("completed Task1");
    }
    
    @Override
    public void run() {
        task1();
    }
}

class Two implements Runnable{
    public static void task2(){
        String message = "Starting task -2 ";
        System.out.println(message);
        try {
            //System.out.println(Thread.currentThread().getName()+"\t"+Thread.currentThread().getState());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         System.out.println("completed Task2");

        
    }
    
    @Override
    public void run() {
        task2();
    }
}

public class WhyThread {
    public static void main(String[] args) {
        
        /*
         * Wihout Multi thread 
         *  
       */ 
        
        /*Date startTime = new Date();
        One.task1();// Once task 1 completed then only start task2
        Two.task2();
        Date endTime = new Date();
        System.out.print("without multithread - time to execute program \t\t");
        
        System.out.println(endTime.getSeconds() -startTime.getSeconds());*/

        //if there is no dependancy b/w task1 and task2 go for Multithread
        //using multi thread
        
        System.out.println( Thread.currentThread().getName() +"\t"+Thread.currentThread() .getState());
        
        One one = new One();
        one.setName("One");
        Thread two =  new Thread( new Two());
        two.setName("two");
        System.out.println("Before start of one & two threads ");
        System.out.println( Thread.currentThread().getName() +"\t"+Thread.currentThread() .getState());
        System.out.println(one.getName()+"\t"+one.getState());
        System.out.println(two.getName()+"\t"+two.getState());
        System.out.println("===========================**");
        
        Date startTime1 = new Date();
        one.start();
        two.start();
        System.out.println("Post start of one & two threads ");
        System.out.println( Thread.currentThread().getName() +"\t"+Thread.currentThread() .getState());
        System.out.println(one.getName()+"\t"+one.getState());
        System.out.println(two.getName()+"\t"+two.getState());
        System.out.println("===========================**");
        try {
            one.join();
            System.out.println("Post one.join() ");
            System.out.println( Thread.currentThread().getName() +"\t"+Thread.currentThread() .getState());
            System.out.println(one.getName()+"\t"+one.getState());
            System.out.println(two.getName()+"\t"+two.getState());
            System.out.println("===========================**");
            two.join();
            System.out.println("Post two.join()");
            System.out.println( Thread.currentThread().getName() +"\t"+Thread.currentThread() .getState());
            System.out.println(one.getName()+"\t"+one.getState());
            System.out.println(two.getName()+"\t"+two.getState());
            System.out.println("===========================**");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date endTime1 = new Date();
        System.out.println(endTime1.getSeconds() -startTime1.getSeconds());
        
        System.out.println("@end");
        System.out.println( Thread.currentThread().getName() +"\t"+Thread.currentThread() .getState());
        System.out.println(one.getName()+"\t"+one.getState());
        System.out.println(two.getName()+"\t"+two.getState());
        System.out.println("===========================**");
    }
}
