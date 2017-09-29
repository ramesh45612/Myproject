package com.ram;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

/*private UserService userService;


	public void setUserService(UserService userService) {
	this.userService = userService;
}
*/
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("index");
		model.addObject("msg","Namo Venkatesha");

		return model;
	}


/*		@RequestMapping("/register")
		public ModelAndView register(@ModelAttribute("user") User user) {
		System.out.println("before register in controller");
		System.out.println(user.getName());
		UserService ob = new UserService();
		ob.register(user);
				
		//this.userService.register(user);
		System.out.println("after register in controller");
		ModelAndView model = new ModelAndView("regsuccess");
		return model;
	}
*/		

	@Autowired
	  private UserDao dao;

	@RequestMapping("/register")
	public ModelAndView register(@ModelAttribute("user") User user) {
		String name=user.getName();
		String mobile=user.getMobile();
		String  email=user.getEmail();
		User usr= new User(name,mobile,email);
		dao.register(usr);
		ModelAndView model = new ModelAndView("regsuccess");
		return model;
	}

}
			

	