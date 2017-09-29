package com.ram;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<RegisterBean> {

	@Override
	public RegisterBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		RegisterBean ob = new RegisterBean();
		ob.setAccountnumber(rs.getString(1));
		ob.setName(rs.getString(2));
		return ob;
	}

}
