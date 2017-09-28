package com.ram.component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ram.Account;
import com.ram.Address;
import com.ram.PersonDto;

@Service
public class PersonService implements IPersonService {
	
	
	@Override
	public PersonDto getPersonDetail(Integer id) {
	
	ObjectMapper objectMapper= new ObjectMapper();
	String accountJsonData="{\"id\":\"1\",\"name\":\"Ram\",\"address\":[{\"city\":\"Sec\",\"state\":\"Telangana\"},{\"city\":\"Hyd\",\"state\":\"Telangana\"}]}";
		Account accountObj=null;
		try {
			accountObj=objectMapper.readValue(accountJsonData, Account.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		PersonDto p = new PersonDto();
		p.setId(accountObj.getId());
		p.setName(accountObj.getName());
		p.setAddress(accountObj.getAddress());
		return p;
	}
}
