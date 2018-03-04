package usingAnnotation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.AnnotationConfiguration;
  
public class UpdateData {  
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
    e1.setFirstName("sankoji");  
    e1.setLastName("ramesh");
    e1.setId(21); // 21 must be in db primary key
    session.update(e1);//persisting the object  
      
    System.out.println("successfully updated");
    
   /* update list of data*/
    List<EmpUsingAnnotation> list = new ArrayList<EmpUsingAnnotation>();
    EmpUsingAnnotation one = new EmpUsingAnnotation();
    one.setFirstName("oooooooooooo");
    one.setLastName("1111111111");
    one.setId(21);
    
    EmpUsingAnnotation two = new EmpUsingAnnotation();
    two.setFirstName("tttttttttttttt");
    two.setLastName("22222222222222");
    two.setId(22);
    
    list.add(one);
    list.add(two);
    
    //session.update(list); //it won't work because arraylist is not mapped entity
    for (EmpUsingAnnotation empList : list) {
     //   session.update(empList);
    }
    
    /*Approach 2 for update
     * load the object from database and modify its value and automatically it will be modified when transaciont got commited*/
   EmpUsingAnnotation updateappoch2 =(EmpUsingAnnotation) session.load(EmpUsingAnnotation.class, new Integer(21));
   updateappoch2.setFirstName("Approach 2F");
   updateappoch2.setLastName("Approach 2L");
   
   
   /* update list of data - Approach 2
    * */
   
//   EmpUsingAnnotation updatelistofData =(EmpUsingAnnotation) session.load(EmpUsingAnnotation.class,"from EmpUsingAnnotation");
    t.commit();//transaction is committed  
    session.close();  
    
      
}  
}  

