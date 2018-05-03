package Core;

public class TryWithFinal {

    static boolean wave(){
        try{
            return true;
        }
        finally{
            return false;
        }
    }
    public static void main(String[] args) {
       boolean b = wave();
       System.out.println(b); //false
       
       
       String s=null;
       try{
           /*if you  define s inside try 
            * will get compile s not available for finally block
            * */
           s="try";
       }
       
       finally{
           s="finally";
       }
       
       System.out.println(s); //finally
       Object o1 = new Object();
       Object o2 =o1;
       Object o3 = new Object();
       System.out.println(o1.equals(o2)); //true
       
       System.out.println(o1.equals(o3)); //false
       
       
       
    }

}
