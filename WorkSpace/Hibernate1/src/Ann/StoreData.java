package Ann;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;  
  
public class StoreData {  
public static void main(String[] args) {  
      
    //using annotations
	AnnotationConfiguration cfg= new AnnotationConfiguration();
	cfg.configure("/Resource/hibernateAnnotations.cfg.xml");
    //creating seession factory object  
    SessionFactory sf=cfg.buildSessionFactory();
    System.out.println(sf);
      
    //creating session object  
    Session session=sf.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    EmpUsingAnnotation e1=new EmpUsingAnnotation();  
    e1.setFirstName("san");  
    e1.setLastName("ram");  
      
    session.save(e1);//persisting the object  
      
    t.commit();//transaction is committed  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}  
