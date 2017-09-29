package database;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

class Emp {  
private int id;
private String name;  

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}

  
class EmpDao {
	
private JdbcTemplate jdbcTemplate;  
  
/*public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  

 public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}*/


public int saveEmployee(Emp emp){  
    String query="insert into test values('"+emp.getId()+"','"+emp.getName()+"')";  
    return jdbcTemplate.update(query);  
}  
public EmpDao(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public int deleteEmployee(Emp emp){  
    String query="delete from test where name='"+emp.getName()+"' ";  
    return jdbcTemplate.update(query);  
}



public List load() 
{ 
	List list=jdbcTemplate.queryForList("select * from test1 ");
	return list;
  
} 

public Object loadObject() 
{
	Object list=jdbcTemplate.queryForObject("select id from test ",String.class);
	return list;
  
} 


}
			 
 public class EmpDemo {  
	  
public static void main(String[] args) {  
    ApplicationContext ap=new ClassPathXmlApplicationContext("database/db.xml");  
    EmpDao dao=(EmpDao)ap.getBean("db");
     Emp insert =(Emp)ap.getBean("insert");
    
   // dao.saveEmployee(insert);
  //dao.deleteEmployee(insert); 
  /*List<Map> list= dao.load();
  for(Map m:list)
  {
	  
	  System.out.println(m.get("id")+"\t"+m.get("name"));
  }*/
  
     List list=dao.load();
     System.out.println(list);
     Iterator it=list.iterator();
     while(it.hasNext())
     {
    Map m=(Map)	it.next();
    System.out.println(m.get("id")+"\t"+m.get("name"));
          
     }
     
    /* System.out.println("Using object");
Object o=dao.loadObject();
System.out.println(o);
*/
}
}  
  


