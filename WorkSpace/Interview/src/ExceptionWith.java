
public class ExceptionWith {
    public static void main(String[] a) {
        Float d;
        try{
            d = Float.parseFloat(a[0]);    
        }
        catch(NumberFormatException e){
            d=(float) 0;
            System.out.println(d);
        }
        
        finally{
            System.out.println(d);
        }
    }

}
