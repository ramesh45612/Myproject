package com.ram;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RegisterController {

@Autowired
private RegisterService registerService;
	
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView model = new ModelAndView("registerForm");
		return model;
	}

	@RequestMapping("/registerpost")
	public ModelAndView registerSuccess(@ModelAttribute("register") RegisterBean registerBean) {
	registerService.store(registerBean);
	ModelAndView model = new ModelAndView("create");
	
	//details also in same page if you want
	List<RegisterBean> list=registerService.getDetails();
	model.addObject("list", list);// end way 2
	
	return model;
}
	

	@RequestMapping("/view")
	public ModelAndView view(@ModelAttribute("register") RegisterBean registerBean) {
	List<RegisterBean> list=registerService.getDetails();
	
	//way 1
	return new ModelAndView("viewForm","list",list);
	
	//way 2
	/*ModelAndView model = new ModelAndView("viewForm");
	model.addObject("list", list);
	return model;
	*/
}
	
}