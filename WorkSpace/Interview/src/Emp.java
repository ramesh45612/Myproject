import java.util.HashMap;
import java.util.HashSet;


public class Emp {

    String name;
    
    public Emp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object ob) {
        Emp e =(Emp)ob;
   // public boolean equals(Emp e) {
        boolean b = false;
        if(e.getName().equals(this.getName()))
        b=true;
        return b;
    }
    
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    
    public static void main(String[] args) {
        Emp one = new Emp("One");
        Emp two = new Emp("One");
        System.out.println(one.equals(two));
        System.out.println(one==two);
        
        HashMap<Emp, Integer> hm = new HashMap<>();
        
        hm.put(one, 1);
        hm.put(two, 2);
        
        System.out.println(hm.size()); // in case hashcode is not overridden size will be 2 even overidden equals
        
        HashSet<Emp> hs = new HashSet<>();
        hs.add(one);
        hs.add(two);
        System.out.println("hashSet\t"+hs.size());// in case hashcode is not overridden size will be 2 even overidden equals

    }

}
