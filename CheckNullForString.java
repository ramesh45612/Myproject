

public class CheckNullForString {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String str=null;
        System.out.println(str);
       // if(str.equals(null))
           // System.out.println("null String"); //gives null pointer exception
    if(str==null)
        System.out.println("str == null, it works");
    //System.out.println(str.length()==0); //NPE
  
   // if(str.equals(null))
       // System.out.println("str equals null");//null pointer exception
    //if(str.equals("null"))
      //  System.out.println("check once");//null pointer exception
   
    //System.out.println(str.isEmpty()); //NPE
    
   // System.out.println(str.compareTo(null));//NPE
    //System.out.println(str.compareTo("null"));//NPE
    String str1="";
    System.out.println(str1==null); //false
    System.out.println(str1.isEmpty()); //true
    System.out.println(str1.length()==0);//true
    
    String str2=" ";
    System.out.println("==str2==");
    System.out.println(str2==null); //false
    System.out.println(str2.isEmpty()); //false
    System.out.println(str2.length()==0);//false
    System.out.println(str2.equals(" "));//true
   
    
    String str3=null;
    
    if(str3==null || str3.isEmpty() || str3.equals(" ")){
        System.out.println("inside empty- works for null or empty or space");
        System.out.println("first condition \t"+(str3==null));
       // System.out.println("2nd  condition \t"+(str3.isEmpty())); //NPE
       // System.out.println("3rd  condition \t"+(str3.equals(" ")));//NPE
    }
    
    String str4=null;
    
    if(str4==null || str4.trim().isEmpty() ||"".equals(str4)){
        System.out.println("string4");
        System.out.println("first condition \t"+(str4==null));
      // System.out.println("2nd  condition \t"+( str4.trim().isEmpty() )); //NPE
       System.out.println("3rd  condition \t"+("".equals(str4))); 
    }
   
 String str5=" ";
    
    if(str5==null ||"".equals(str5)||" ".equals(str5)){
        System.out.println("===string5====");
        System.out.println("first condition \t"+(str5==null));
       System.out.println("2nd  condition \t"+("".equals(str5))); 
       System.out.println("3rd  condition \t"+(" ".equals(str5)));
    }
    
    }
    
}
