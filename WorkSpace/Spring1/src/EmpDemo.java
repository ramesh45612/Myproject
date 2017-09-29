import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

class Employee {  
private String name;  

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}

  
class EmployeeDao {
	
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  

 public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public int saveEmployee(Employee e){  
    String query="insert into test1 values('"+e.getName()+"')";  
    return jdbcTemplate.update(query);  
}  
public int updateEmployee(Employee e){  
    String query="update test1 set name='"+e.getName()+"' ";  
    return jdbcTemplate.update(query);  
}  
public int deleteEmployee(Employee e){  
    String query="delete from test1 where name='"+e.getName()+"' ";  
    return jdbcTemplate.update(query);  
}



public List load()
{
	List list=jdbcTemplate.queryForList("select * from test1");
	return list;
}
  
} 

public class EmpDemo {  
	  
public static void main(String[] args) {  
    ApplicationContext ap=new ClassPathXmlApplicationContext("db.xml");  
    EmployeeDao dao=(EmployeeDao)ap.getBean("db");
    
    Employee ob =(Employee)ap.getBean("dynamic");
    //dao.saveEmployee(ob);
   // dao.updateEmployee(ob);
   dao.deleteEmployee(ob); 
   List l=dao.load();
    Iterator itr=l.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
}  
  
}  
