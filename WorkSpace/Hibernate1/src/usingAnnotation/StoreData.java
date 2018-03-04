package usingAnnotation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.AnnotationConfiguration;
  
public class StoreData {  
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
          
    EmpUsingAnnotation e1=new EmpUsingAnnotation();  
    e1.setFirstName("san");  
    e1.setLastName("ram");  
    session.save(e1);//persisting the object  
      
      
    System.out.println("successfully saved");
    
   /* save list of data*/
    
    List<EmpUsingAnnotation> list = new ArrayList<EmpUsingAnnotation>();
    
    EmpUsingAnnotation one = new EmpUsingAnnotation();
    one.setFirstName("One");
    one.setLastName("1");
    
    EmpUsingAnnotation two = new EmpUsingAnnotation();
    two.setFirstName("Two");
    two.setLastName("1");
    
    list.add(one);
    list.add(two);
    
    //session.save(list); //it won't work because arraylist is not mapped entity
    for (EmpUsingAnnotation empList : list) {
        session.save(empList);
    }

    t.commit();//transaction is committed  
    session.close();  
    
    
      
}  
}  
