package com.ram.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.stereotype.Repository;

import com.ram.bean.RegisterBean;


@Repository("RegisterDao")

public class RegisterDao {
	
    @Autowired
	private SessionFactory sessionFactory;
    
	/*public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

*/	public void store(RegisterBean rb){
		sessionFactory.openSession().saveOrUpdate(rb);		
			}//end of save
	

public List<RegisterBean> getDetails(){
return  sessionFactory.getCurrentSession().createQuery("from reg").list();
	}

	
	
	
}//end of class