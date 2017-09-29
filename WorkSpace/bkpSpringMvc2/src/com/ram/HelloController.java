package com.ram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","Namo Venkatesha");

		return model;
	}
 
	@RequestMapping("/home")
	public ModelAndView loginHome() {

		ModelAndView model = new ModelAndView("login");
		return model;
	}

	
		
	@RequestMapping("/login.ram")
	//way 1
	//public ModelAndView login(@RequestParam("username") String username,@RequestParam("password") String password) {
	
	//way 2 - Start
	public ModelAndView login(@RequestParam Map <String,String> reqParam){
	String username=reqParam.get("username");
	String password=reqParam.get("password");

	EmpDao emp= new EmpDao();
	System.out.println("created emp");
	List list=emp.load();
	System.out.println(list);
	
	//way 2 - end
			if(username.equals("ram") && password.equals("venky") )
		{
				
					Map m = new HashMap();
			m.put("msg","Hello"+username);
			//m.put("list", l);
			ModelAndView ob = new ModelAndView("loginsuccess",m);
			ob.addObject("username", username);
			ob.addObject("password", password);
			ob.addObject("list", list);
			return ob;
				
		}
		
		else 
			
			return new ModelAndView("loginfailure");
		
	}

	}
		

	