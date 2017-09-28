package com.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ram.component.IPersonService;

@RestController
public class PersonController {
	@Autowired
	private IPersonService personService;
	
	@RequestMapping("/person")
	public PersonDto getPersonDetail(@RequestParam(value = "id",required = false,
	                                                    defaultValue = "0") Integer id) {
		PersonDto p = personService.getPersonDetail(id);
		return p;
	}	
	}
	
