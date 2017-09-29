import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

  
class ConnectDb {

private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}
  
}

class Insert
{
	private Employee employee;
	private ConnectDb connect;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public ConnectDb getConnect() {
		return connect;
	}
	public void setConnect(ConnectDb connect) {
		this.connect = connect;
	}
	
	public int saveEmployee(Employee e){  
	    String query="insert into test1 values('"+e.getName()+"')";  
	    return getConnect().getJdbcTemplate().update(query);
	}  
	
}

public class EmpDemo1 {  
	  
public static void main(String[] args) {  
    ApplicationContext ap=new ClassPathXmlApplicationContext("db.xml");  
    Employee emp=(Employee)ap.getBean("employee1");
    Insert ob=(Insert)ap.getBean("insert");
    ob.saveEmployee(emp);
    }  
  
}  
