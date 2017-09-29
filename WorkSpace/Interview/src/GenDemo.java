
class Gen1<T extends Number> // bounded Type it accepts number and its sub classes
{
    
}

//Gen<T extends x> x can be class or interface

// we can define bounded types only by using extends and we can't use implements and super keywords but we can replace with 
//extends

class Gen<T>   // unbounded type
{
    T ob;
    public Gen(T ob) {
     
        this.ob=ob;
    }
    
    void show()
    {
        System.out.println(ob.getClass().getTypeName());
    }
    
    public T getOb()
    {
        return ob;
    }
}
public class GenDemo {
 public static void main(String[] args) {
Gen<String> ob= new Gen<String>("Sakoji Ramesh");
ob.show();
 System.out.println(ob.getOb());
    }

}
