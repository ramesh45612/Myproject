package database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class InternalDBConnection {
    public static void main(String[] args) {
        DriverManagerDataSource ob= new DriverManagerDataSource();
        ob.setDriverClassName("com.mysql.jdbc.Driver");
        ob.setUrl("jdbc:mysql://localhost:3306/ram");
        ob.setUsername("root");
        ob.setPassword("anvi");
        /* 
        //used below in case of setter based DI
         JdbcTemplate jt=new JdbcTemplate();  
        jt.setDataSource(ob);      
        */
        //used below in case of constructor based DI
        
        JdbcTemplate jt=new JdbcTemplate(ob);
        String sql="insert into ram.emp values('3','first','last','1234')";
        System.out.println(sql);
        jt.update(sql);
        System.out.println("one row inserted successfully");
    }
}
