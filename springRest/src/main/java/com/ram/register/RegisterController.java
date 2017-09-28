package com.ram.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

	
	@RequestMapping(value ="/register1", method = RequestMethod.POST)
	public String register(@RequestBody RegisterCommand command) {
		StringBuilder reponseData = new StringBuilder();
				
		return reponseData.toString();
	}

}
