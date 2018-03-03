package whylist;

import java.util.ArrayList;
import java.util.List;


class Emp{
    
    private String firstName;
    private String lastName;
    private String id;
    
    public Emp(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Emp))  return false;
        Emp emp =(Emp)obj;
        return this.id.equals(emp.id);
        
    }
    
    @Override
    public int hashCode() {
        return this.id.hashCode()+this.firstName.hashCode()+this.lastName.hashCode();
    }
}

public class ListEqual {
	public static void main(String[] args) {
	    
	    
	    List<String> list = new ArrayList();
	    list.add("a");
	    list.add("b");
	    list.add("c");
	    list.add("a");
        
	    List<String> list1 = new ArrayList();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("a");
        
        System.out.println(list.equals(list1)); //true
	    

        List<Emp> wiproList = new ArrayList();
        wiproList.add(new Emp("Sankoji", "Ram", "1"));
        wiproList.add(new Emp("Sankoji", "Kriss", "2"));
        
        List<Emp> cgiList = new ArrayList();
        cgiList.add(new Emp("Sankoji", "Ram", "1"));
        cgiList.add(new Emp("Sankoji", "Kriss", "2"));

        System.out.println(wiproList.equals(cgiList));
        System.out.println( wiproList.indexOf(new Emp("", "", "2"))); //1  it also inernally checks equals of Emp
        System.out.println(wiproList.contains("Sankoji")); //false
        
        System.out.println(wiproList.contains(new Emp("a", "a", "2")));//true  it also inernally checks equals of Emp
        
        
	}

}
