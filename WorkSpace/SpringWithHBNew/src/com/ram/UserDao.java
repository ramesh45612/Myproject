package com.ram;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;  
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.stereotype.Repository;
	  
@Repository
public class UserDao {  
	
	@Autowired
	@Qualifier(value="sessionFactory")
	private SessionFactory sessionFactory;
		  
	public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public  void register(User u){
		
	System.out.println("inside register method");
	
	Session session = this.sessionFactory.getCurrentSession();

	System.out.println(session);
	
	/*     System.out.println("post session object ");
     session.persist(u);
     System.out.println("after persist");
*/
	// added below
	    

//This step will read hibernate.cfg.xml and prepare hibernate for use	
//SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

 
 //AnnotationSessionFactoryBean ob = new AnnotationSessionFactoryBean();
 //Session session = this.sessionFactory.getCurrentSession();
	System.out.println(session);
	  Transaction t=session.beginTransaction();  
	  t.begin();            
	  session.save(u);                
	  t.commit();  
	  session.close();  
	 }  
	}  


