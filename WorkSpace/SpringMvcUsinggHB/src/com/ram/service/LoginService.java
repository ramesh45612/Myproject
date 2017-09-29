package com.ram.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ram.bean.RegisterBean;
import com.ram.dao.LoginDao;
import com.ram.dao.RegisterDao;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	//way 1
/*	@Transactional
	public RegisterBean validate(RegisterBean rb)
	{
		return loginDao.validate(rb);
		
	}
*/	

	@Transactional
	public boolean validate(RegisterBean rb)
	{
		return loginDao.validate(rb);
		
	}
	
}
