package writtenTest;

public class ValueOffBoolean {
    
    public void go(Object n) {
        System.out.println("Object - parent");
    }
    
    public void go(String n) {
        System.out.println("String - child");
    }
    
    
    public static void main(String[] args) {

        ValueOffBoolean ob = new ValueOffBoolean();
        ob.go(null); //String -child
        System.out.println(Boolean.valueOf("True")); //true
        System.out.println(Boolean.valueOf("TRUE"));//true
        System.out.println(Boolean.valueOf("true"));//true
        System.out.println(Boolean.valueOf("TrUe"));//true
        System.out.println(Boolean.valueOf("Tre"));//false
        System.out.println(Boolean.valueOf("false"));//false
        System.out.println(Boolean.valueOf("except any thing true is false"));//false
        System.out.println(Boolean.valueOf("FALSE"));//false
        System.out.println(Boolean.valueOf(null));//false
        System.out.println(Boolean.valueOf(""));//false
        
        Boolean b = new Boolean(null);
        System.out.println("null also"+b); //false
        Boolean b1 = new Boolean("a"+"True"); //false
        //except any thing true is false
        Boolean b2 = new Boolean("tr"); //false
        Boolean b3 = new Boolean(true);//true
        Boolean b4 = new Boolean(false);//false
       // Boolean b5 = new Boolean(tru);//compile error tru can't be resolved to a variable
        System.out.println(b4);//true
        
        
      /*  It has 2 constructors 
        1) Boolean b = new Boolean(String s); s = any string
        2) Boolean b = new Boolean(boolean b); b= true or false
        or you can use value.off method*/ 
        


    }

}
