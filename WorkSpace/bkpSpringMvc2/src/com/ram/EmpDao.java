package com.ram;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

/*class Emp {  
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
*/
  
public class EmpDao {
	
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  

 public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}


/*public int saveEmployee(Emp emp){  
    String query="insert into test values('"+emp.getId()+"','"+emp.getName()+"')";  
    return jdbcTemplate.update(query);  
}*/
 
public int deleteEmployee(){  
    String query="delete from test  ";  
    System.out.println("after query");
    System.out.println(jdbcTemplate.update(query));
    return jdbcTemplate.update(query);
    
}



public List load() 
{ 
	System.out.println("before load");
	List list=jdbcTemplate.queryForList("select * from test1 ");
	System.out.println(list);
	/*List list=new ArrayList();
	list.add("ram");
*/	return list;
  
} 


}
			 
