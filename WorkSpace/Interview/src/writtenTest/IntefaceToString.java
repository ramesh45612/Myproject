package writtenTest;

interface A{
    String toString();
}

public class IntefaceToString  {

    public static void main(String[] args) {
   
        A  ob = new A() {
            @Override
            public String toString() {
                return "test";
            }
        };
        System.out.println(ob.toString());
       
    }
}
