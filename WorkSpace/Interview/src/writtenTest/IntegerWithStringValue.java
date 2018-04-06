package writtenTest;

public class IntegerWithStringValue {

    /**
     * @param args
     */
    public static void main(String[] args) {
      /*Integer a= Integer.parseInt("ramesh");
      System.out.println(a); //NumberFormat Exception @Runtime
      */
      
      Integer c= new Integer(1)+ new Integer(2);
      
      
      switch(c){
      
      case 3: System.out.println("case3");
      break;
      default: System.out.println("default");  
      
      /*o/p above case3*/
      
      /*in case of break is not present o/p -->case3 default*/
          
      }

    }

}
