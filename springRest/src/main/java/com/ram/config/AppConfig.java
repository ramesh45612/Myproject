package com.ram.config;  
  
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
  
@Configuration 
@ComponentScan("com.ram") 
@EnableWebMvc   
public class AppConfig {  

    @Bean
    public DataSource dataSource() {

	 DriverManagerDataSource ob= new DriverManagerDataSource();
     ob.setDriverClassName("oracle.jdbc.driver.OracleDriver");
     ob.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
     ob.setUsername("system");
     ob.setPassword("anvi");
     return ob;
    }
    
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }

    
}  
