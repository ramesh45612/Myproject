package com.ram;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RegisterRowMapper implements RowMapper<RegisterBean> {

	@Override
	public RegisterBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		RegisterBean registerBean = new RegisterBean();
		registerBean.setFirstName(rs.getString("firstName"));
		registerBean.setLastName(rs.getString("lastName"));
		registerBean.setMobileNumber(rs.getString("mobileNumber"));
		return registerBean;
	}

}
