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

	public int store(RegisterBean rb){
		String sql="insert into contact values('"+rb.getFirstName()+"','"+rb.getLastName()+"','"+rb.getMobileNumber()+"')";
		System.out.println(sql);
		return template.update(sql);
	}//end of save
	
	
	public List<RegisterBean> getDetails(){
		return template.query("select * from contact",new RegisterRowMapper());
	}

	
	
	
}//end of class