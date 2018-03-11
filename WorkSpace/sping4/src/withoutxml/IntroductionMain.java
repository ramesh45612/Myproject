package withoutxml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") 
 // by default is this nature
class Introduction implements ApplicationContextAware{
    ApplicationContext apc;
    private String firstName;
    private String lastName;
    
    
    
    @Autowired
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Lookup
    public Address getAddress() {
   return address;
//       return( (Address)apc.getBean(Address.class));
        //return null;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public void setApplicationContext(ApplicationContext apc)
            throws BeansException {
       this.apc=apc;
        
    }
    
    @Override
    public String toString() {
        return "Introduction [firstName=" + firstName + ", lastName="
                + lastName + ", address=" + address + "]";
    }
    
    
}

@Component
@Scope("prototype")
class Address{
    
    private String city;
    private String state;
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "Address [city=" + city + ", state=" + state + "]";
    }
    
    
}

@Configuration
@ComponentScan(basePackages = "withoutxml")
class AppConfig{
    
}

public class IntroductionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
       // AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext("appConfig");  //we can' do
        
        /*Introduction ob1 = ap.getBean(Introduction.class);*/   // way -1
        Introduction ob1 = (Introduction)ap.getBean("introduction"); //way -2
        ob1.setFirstName("sankoji");
        ob1.setLastName("Ram");
        
        Address addr1 = ap.getBean(Address.class);
        addr1.setCity("Nirmal");
        addr1.setState("telangana - N");
        
        ob1.setAddress(addr1);
        System.out.println(ob1);
        
        Introduction ob2 = ap.getBean(Introduction.class);
        System.out.println(ob2);
        System.out.println(ob1==ob2);
        
        
        Address addr2 = ap.getBean(Address.class);
        addr2.setCity("Hyderabad");
        
        System.out.println(addr1);
        System.out.println(addr2);
        
        System.out.println("address"+(ob1.getAddress()==ob2.getAddress()));
        
        System.out.println(addr1==addr2);
        
        
        
    }

}
