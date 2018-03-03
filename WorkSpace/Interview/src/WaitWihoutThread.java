

class A{
    private String name;

    public A(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}


public class WaitWihoutThread {
    public static void main(String[] args) {
       A ob = new A("RAM");
        try {
            ob.wait(); // compile success but will Runtime IllegalMonitorStateException
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  
       System.out.println(ob.getName());
    }
}
