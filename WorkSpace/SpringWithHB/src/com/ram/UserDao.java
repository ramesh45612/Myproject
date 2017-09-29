package com.ram;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;  
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;  
	  
	public class UserDao {  
	  
	public static int register(User u){  
	 int i=0;  
	/* Session session=new AnnotationConfiguration().  
	  configure().buildSessionFactory().openSession();  
	*/
	 AnnotationConfiguration cfg= new AnnotationConfiguration();
		cfg.configure("/ram/hibernate.cfg.xml");
	    //creating seession factory object  
	    SessionFactory sf=cfg.buildSessionFactory();  
	      System.out.println(sf);
	    //creating session object  
	    Session session=sf.openSession();  
	    Transaction t=session.beginTransaction();  
	  t.begin();  
	                  
	  i=(Integer)session.save(u);  
	                  
	  t.commit();  
	  session.close();  
	    
	  return i;  
	 }  
	}  


