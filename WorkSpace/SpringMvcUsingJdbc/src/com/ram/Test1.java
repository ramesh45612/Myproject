package com.ram;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test1 {
    public static void main(String[] args) {
        
        DriverManagerDataSource ob= new DriverManagerDataSource();
        ob.setDriverClassName("com.mysql.jdbc.Driver");
        ob.setUrl("jdbc:mysql://localhost:3306/ram");
        ob.setUsername("root");
        ob.setPassword("anvi");
        JdbcTemplate jt=new JdbcTemplate();  
        jt.setDataSource(ob);
        System.out.println(jt.getDataSource());
        String sql="insert into contact values('hi','How','you')";
        System.out.println(sql);
        jt.update(sql);
        System.out.println("one row inserted successfully");
    }
}
