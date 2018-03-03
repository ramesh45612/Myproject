package card;

import java.util.HashSet;
import java.util.Set;

class Person{
    
    private String name;
    
    
    public Person(String name) {
        this.name=name;

    }
    
     @Override
    public boolean equals(Object ob) {
     if(!(ob instanceof Person)) return false;
     Person p =(Person) ob;
     return p.name.equals(this.name);
    }
   
      @Override
    public int hashCode() {
        //return name.hashCode();
          return 1;
    }

}

public class Demo {
    public static void main(String[] args) {

        Person p1= new Person("sankoji");
        Person p2= new Person("sankoji");
        System.out.print(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1==p2);
        
        Set<Person> set = new HashSet();
        
        set.add(p1);
        set.add(p2);
        System.out.println(set.size());
        
        Person p3= new Person("Ramesh");
        set.add(p3);
        System.out.println(set.size());
        
        
        
        
    }

}
