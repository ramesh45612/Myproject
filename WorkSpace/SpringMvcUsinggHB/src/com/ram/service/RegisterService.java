package com.ram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ram.bean.RegisterBean;
import com.ram.dao.RegisterDao;

@Service
public class RegisterService {

	@Autowired
	private RegisterDao registerDao;
	
	//store into database
	@Transactional
	public void store(RegisterBean registerBean){
		
		 registerDao.store(registerBean);
		 System.out.println("stored successfully");
	}

	//Retrieve the data from database
	@Transactional
	public List<RegisterBean> getDetails()
	{
		List list=registerDao.getDetails();
		System.out.println(list);
		return list;
	}
}
