package com.ram.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.stereotype.Repository;

import com.ram.bean.RegisterBean;


@Repository("loginDao")

public class LoginDao {
	
    @Autowired
	private SessionFactory sessionFactory;
    
/*public List<RegisterBean> getDetails(){
return  sessionFactory.getCurrentSession().createQuery("from reg").list();
	}
*/

    //way-1
    /*
    public RegisterBean validate(RegisterBean rb)
    {
    	Session sesion=sessionFactory.openSession();
   
    Query query=sessionFactory.getCurrentSession().createQuery("from reg as re where re.mobileNumber=? and re.password=?");	
 	query.setParameter(0, rb.getMobileNumber());
	query.setParameter(1, rb.getPassword());
	rb=(RegisterBean)query.uniqueResult();
	
	System.out.println("details from database from LoginDao");
	System.out.println(rb.getMobileNumber());
	System.out.println(rb.getPassword());
	System.out.println(rb.getFirstName());
	System.out.println(rb.getLastName());
	System.out.println("Login Dao End");
	return rb;
    }
	*/

    //way 2
    
    //it return  true user name and password are math else false

    public boolean validate(RegisterBean rb){
    	
    		Query query=sessionFactory.getCurrentSession().createQuery("from reg as re where re.mobileNumber=? and re.password=?");	
    	 	query.setParameter(0, rb.getMobileNumber());
    		query.setParameter(1, rb.getPassword());
    		RegisterBean dbResult=null;
    		dbResult=(RegisterBean)query.uniqueResult();
    		
    	/*	System.out.println("dbResult from LoginDao"+dbResult);
    		
    		System.out.println("Bean properties");
    		System.out.println(rb.getId());
    		System.out.println(rb.getFirstName());
    		System.out.println(rb.getLastName());
    		System.out.println(rb.getMobileNumber());
    		System.out.println(rb.getPassword());
    		System.out.println("end of bean properties- input parameters");
    		
    		System.out.println("Database Result");
    		System.out.println(dbResult.getId());
    		System.out.println(dbResult.getFirstName());
    		System.out.println(dbResult.getLastName());
    		System.out.println(dbResult.getMobileNumber());
    		System.out.println(dbResult.getPassword());
    		    		
    	*/	
    	if(dbResult!=null&& rb.getMobileNumber().equals(dbResult.getMobileNumber())&&rb.getPassword().equals(dbResult.getPassword()))
    	//if(rb.equals(dbResult)) - it won't work 
    		return true;
    		else
    		return false;
    	
    }
    
}//end of class