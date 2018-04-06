package writtenTest;

public class MyException {

    static void test() throws RuntimeException{
        try{
            System.out.println("Test");
            throw new RuntimeException();
        }
        catch(Exception e){
            System.out.println("Exception - catch");
        }
    }
    public static void main(String[] args) {
        try{
        test();
        }
        catch(RuntimeException e){
            System.out.println("runtime - main");
        }
        System.out.println("end");
        
    }
}
