package usingAnnotation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.AnnotationConfiguration;
  
public class RetrieveData {  
public static void main(String[] args) {  
	AnnotationConfiguration cfg= new AnnotationConfiguration();
	cfg.configure("usingAnnotation/hibernateAnnotations.cfg.xml");
    SessionFactory sf=cfg.buildSessionFactory();
    Session session=sf.openSession();  

    Query query = session.createQuery("from EmpUsingAnnotation");
    List<EmpUsingAnnotation> list = query.list();

    for (EmpUsingAnnotation emp : list) {
        System.out.print(emp.getId());
        System.out.print("\t"+emp.getFirstName());
        System.out.println("\t"+emp.getLastName());
        
    }
    
    /*get only particular record from emp
     * */
    EmpUsingAnnotation emp = new EmpUsingAnnotation();
    emp.setId(21);
   
    //way -1
//   Query single = session.createQuery("from EmpUsingAnnotation where id="+emp.getId());
    //way -2
    /*Query single = session.createQuery("from EmpUsingAnnotation where id=:empId");
    single.setParameter("empId", emp.getId());*/
    //way -3
    Query single = session.createQuery("from EmpUsingAnnotation where id =?");
    /*index start from zero here*/
    single.setParameter(0, emp.getId());
    List<EmpUsingAnnotation> list1 = single.list();

    for (EmpUsingAnnotation emp1 : list1) {
        System.out.print(emp1.getId());
        System.out.print("\t"+emp1.getFirstName());
        System.out.println("\t"+emp1.getLastName());
        
    }
    

    
    
    
    session.close();  
}  
}  
