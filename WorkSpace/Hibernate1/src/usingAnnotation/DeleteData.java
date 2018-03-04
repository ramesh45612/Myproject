package usingAnnotation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.AnnotationConfiguration;
  
public class DeleteData {  
public static void main(String[] args) {  
    //using annotations
	AnnotationConfiguration cfg= new AnnotationConfiguration();
	cfg.configure("usingAnnotation/hibernateAnnotations.cfg.xml");
    //creating seession factory object  
    SessionFactory sf=cfg.buildSessionFactory();
    //creating session object  
    Session session=sf.openSession();  
    //creating transaction object  
    Transaction t=session.beginTransaction();  
    EmpUsingAnnotation del = new EmpUsingAnnotation();
    del.setId(1);
    //way -1
    //session.delete(del);
    
    //way-2 
    
    Query query = session.createQuery("delete from EmpUsingAnnotation where id=:empid");
    query.setParameter("empid", del.getId());
    int i = query.executeUpdate();
    t.commit();//transaction is committed  
    session.close();  
    System.out.println("successfully delted " +i);
}  
}  
