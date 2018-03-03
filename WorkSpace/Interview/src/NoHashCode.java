import java.util.HashSet;



class Person1{
    public final String name;
    public Person1(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }  
  
 /*   @Override
    public boolean equals(Object ob) {
     if(!(ob instanceof Person1)) return false;
     Person1 p =(Person1) ob;
     return p.name.equals(this.name);
    }
 */   
    @Override
    public int hashCode() {
     //   return super.hashCode();
        return 1;
    }
 
    // in case if we are not o/verriding hashcode duplicates will be inserted even presence of equals also
}

public class NoHashCode {
    public static void main(String[] args) {
        
        Person1 p1= new Person1("sankoji");
        Person1 p2= new Person1("sankoji");
        
        System.out.println(p1.equals(p2)); //true
        System.out.println(p1==p2);   //false
        
        System.out.println("p1 hashcode\t"+p1.hashCode());
        System.out.println("p2 hashcode\t"+p2.hashCode());
        HashSet<Person1> h1= new HashSet();
        h1.add(p1);
        h1.add(p2);
        System.out.println(h1.size()); //2  due to no hash code, duplicates also inserting  even presence of equals
        System.out.println(h1.hashCode());
    }

}
