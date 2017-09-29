package com.ram;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegisterService {

	@Autowired
	private RegisterDao registerDao;
	
	//store into database
	@Transactional
	public int store(RegisterBean registerBean){
		return registerDao.store(registerBean);
	}

	//Retrieve the data from database
	@Transactional
	public List<RegisterBean> getDetails()
	{
		List list=registerDao.getDetails();
		return list;
	}
}
