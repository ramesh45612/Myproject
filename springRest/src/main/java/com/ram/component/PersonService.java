package com.ram.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ram.Address;
import com.ram.Person;

@Component
public class PersonService implements IPersonService {
	@Override
	public Person getPersonDetail(Integer id){
		Person p = new Person();
		p.setId(id);
		p.setName("Ram");
	Address addr= new Address();
	addr.setCity("Hyd");
	addr.setState("Telangana");
	p.setAddress(addr);
	
	Address addr1= new Address();
	addr1.setCity("ListHyd1");
	addr1.setState("ListTelangana1");

	Address addr2= new Address();
	addr2.setCity("ListHyd2");
	addr2.setState("ListTelangana2");

	List<Address> list = new ArrayList<Address>();
	list.add(addr1);
	list.add(addr2);
	
	p.setList(list);
	
	String abc[]= {"Male","Female","Others"};
	p.setGender(abc);
		return p;
	}
}
