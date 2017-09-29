package com.ram;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("index");
		model.addObject("msg","Namo Venkatesha");

		return model;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(@ModelAttribute("user") User user) {
		String name=user.getName();
		String mobile=user.getMobile();
		String  email=user.getEmail();
		User usr= new User(name,mobile,email);
		UserDao dao=new UserDao();
		int i=dao.register(usr);
		ModelAndView model = new ModelAndView("regsuccess");
		return model;
	}
		
}
			

	