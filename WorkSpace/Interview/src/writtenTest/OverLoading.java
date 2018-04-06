package writtenTest;

public class OverLoading {

    public void go(Short n) {
        System.out.println("Short");
    }

    public void go(short n) {
        System.out.println("short");
    }

    public void go(int n) {
        System.out.println("int");
    }

    public void go(Integer n) {
        System.out.println("Integer");
    }

    public void go(long l) {
        System.out.println("long");
    }

    public void go(Long n) {
        System.out.println("Long");
    }
    
    public void go(Object n) {
        System.out.println("Object - parent");
    }
    
    public void go(String n) {
        System.out.println("String - child");
    }

    public static void main(String[] args) {
        OverLoading ob = new OverLoading();
        Short y = 6;
        long z = 7;
        ob.go(y);// Short
        ob.go(z);// long
        ob.go(2);// int, Note: in case go (int n) is not there --> Integer
        /* applicable for above and below, in case of go (int n) and go (Integer
         n) is not there --> long
         internally int / Integer convert to int then  promote to long*/
        ob.go(new Integer(3));// Integer  
       // Note: in case go (Integer n) is not there --> int
        ob.go("as"); // String  in case go (String n) is not there --> Object
        
    }

}

/* byte / char - short - int - long - float - double *
 * first auto boxing in case of auto boxing is not present  promote to next level
 * /
 */