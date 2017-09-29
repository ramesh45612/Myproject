package com.hb;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.orm.hibernate3.HibernateTemplate;



@Entity
@Table(name="CoreHB")
class CoreHB
{
@Id
private int id; 

private String name;

private double sal;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSal() {
	return sal;
}

public void setSal(double sal) {
	this.sal = sal;
}
	

}


class CoreDao
{
	
HibernateTemplate hb;

public void setHb(HibernateTemplate hb) {
	this.hb = hb;
}

public void saveEmp(CoreHB ch)
{
	hb.save(ch);
}


}



public class UsingHBTemplate 
{
public static void main(String[] args) {
	Resource resource=new ClassPathResource("usingHbTemplate.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	
	CoreHB ch=new CoreHB();
	ch.setId(12);
	ch.setName("Sankoji");
	ch.setSal(1250.00);
	
	CoreDao dao=(CoreDao)factory.getBean("dao");
	dao.saveEmp(ch);
	System.out.println("Successfully created");
	
}
}