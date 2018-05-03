package collectionSnippets;

import java.util.HashSet;
import java.util.Set;

class Emp {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Emp [firstName=" + firstName + "]";
    }
}

final class Address {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address [state=" + state + "]";
    }
}

final class ImmputableEmp {
    private final String firstName;

    public ImmputableEmp(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    /*
     * public void setFirstName(String firstName) { this.firstName = firstName;
     * //Error at above line due to final first name }
     */

    @Override
    public String toString() {
        return "Emp [firstName=" + firstName + "]";
    }
}

public class JPMorgan {

    public static void main(String[] args) {

        Set<Emp> set = new HashSet<Emp>();
        Emp ob = new Emp();
        ob.setFirstName("Sankoji");
        set.add(ob);
        ob.setFirstName("SankojiNew");
        System.out.println(set); // sankojiNew

        Set<Address> set1 = new HashSet<Address>();
        Address addr = new Address();
        addr.setState("Telangana");
        set1.add(addr);
        addr.setState("Telangana New");
        System.out.println(set1); // New Telangana

        Set<ImmputableEmp> set2 = new HashSet<ImmputableEmp>();
        ImmputableEmp emp1 = new ImmputableEmp("Ramesh");
        set2.add(emp1);
        // emp1.setFirstName("SankojiNew");
        // u can't set here
        System.out.println(set2);// Ramesh
        // here we can't change once created there is no setters

    }
}
