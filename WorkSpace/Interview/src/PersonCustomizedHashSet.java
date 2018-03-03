import java.util.HashSet;

public class PersonCustomizedHashSet extends HashSet<Person>{
 /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public static void main(String[] args) {
    PersonCustomizedHashSet g = new PersonCustomizedHashSet();
     g.add(new Person("sankoji"));
     g.add(new Person("sankoji"));
     g.add(new Person("sankoji"));
     g.add(new Person("Ram"));
     for (Person person : g) {
         System.out.println(person.getName());
    }
    }
    
 public boolean add(Person o){
     System.out.println("Adding from our Person customized Hashset");
     return super.add(o);
 }
}

class Person{
    public final String name;
    public Person(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }  
  
    @Override
    public boolean equals(Object ob) {
     if(!(ob instanceof Person)) return false;
     Person p =(Person) ob;
     return p.name.equals(this.name);
    }
    /*@Override
    public int hashCode() {
        return 1;
    }
    */
    
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    
    // in case if we are not overrdiding hashcode duplicates will be inserted even presence of equals also
}

