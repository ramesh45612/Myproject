package com.ram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ram.bean.RegisterBean;
import com.ram.service.LoginService;


@Controller
public class LoginController {

@Autowired
private LoginService loginService;
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView model = new ModelAndView("login/loginform");
		return model;
	}

	
	
	@RequestMapping("/validate")
	public ModelAndView validate(@ModelAttribute("register") RegisterBean rb) {
	ModelAndView model=null;
	//way 2 only status	
	boolean valid=loginService.validate(rb);
	System.out.println("From Login Controller "+valid);
	if(valid)
	model = new ModelAndView("login/success");
	else
	model = new ModelAndView("login/loginform");
	return model;
	}
	
}