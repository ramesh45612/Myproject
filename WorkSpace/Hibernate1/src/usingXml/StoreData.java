package usingXml;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;  
  
public class StoreData {  
public static void main(String[] args) {  
      
    //creating configuration object  using xml file mapping 
    /*Configuration cfg=new Configuration();  
    cfg.configure("/usingXml/hibernate.cfg.xml");//populates the data of the configuration file  
    */ 
	//using annotations
	AnnotationConfiguration cfg= new AnnotationConfiguration();
	cfg.configure("usingXml/hibernate.cfg.xml");
    //creating seession factory object  
    SessionFactory sf=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=sf.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    Employee e1=new Employee();  
    e1.setFirstName("sankoji");  
    e1.setLastName("Ram");  
      
    session.save(e1);//persisting the object  
      
    t.commit();//transaction is committed  
    session.close();  
    System.out.println("successfully saved");  
}  
}  
