package com.ram;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;  
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;  
	  
	public class UserDao {  
		
		
	    private SessionFactory sessionFactory;
	
	  
	public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}


	public  void register(User u){  
	System.out.println("inside register method");
    /* Session session = this.sessionFactory.getCurrentSession();
     System.out.println("post session object ");
     session.persist(u);
     System.out.println("after persist");
	*/
	// added below
	    
	
	sessionFactory.openSession().saveOrUpdate(u);  
	System.out.println("end of sesion factroy");      
	 	
	
	 }  
	}  


