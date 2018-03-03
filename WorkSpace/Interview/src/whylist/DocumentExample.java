package whylist;

/**
 * 
 * @author Anvi
 *
 */
interface Employee{
    /**
     * this mehtod helps us to add employees
     * @param  emp
     * @return boolean
     */
    boolean addEmployee(Emp emp);
    
}

class EmployeeImpl implements Employee{

    @Override
    public boolean addEmployee(Emp emp) {
        return false;
    }
    
}

public class DocumentExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Employee ob = new EmployeeImpl();
        ob.

    }

}
