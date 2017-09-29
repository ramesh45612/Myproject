package com.ram;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
@RequestMapping("welcome.ram")
public ModelAndView welcome() 
	{		
	ModelAndView mav = new ModelAndView("login");
	return mav;
	}

@RequestMapping("login.ram")
public ModelAndView login(@Valid @ModelAttribute("model") Login login) 
	{
	ModelAndView mav = new ModelAndView("loginSuccess");
	return mav;
	}
}
