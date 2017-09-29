package com.ram;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;


@Repository("RegisterDao")

public class RegisterDao {
	
    @Autowired
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(RegisterBean p){
		
		String sql="insert into register values('"+p.getAccountnumber()+"','"+p.getName()+"')";
		System.out.println(sql);
		System.out.println("inside save");
		
		System.out.println("Template"+template);
		
		
		System.out.println("after sysout");
		return template.update(sql);
	}//end of save
	
	
	public List<RegisterBean> getDetails(){
		return template.query("select * from register",new CustomerRowMapper());
	}

	
	
	
}//end of class