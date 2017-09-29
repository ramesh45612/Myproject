package com.ram;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RegisterController {

//banking operations
	
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView model = new ModelAndView("registerform");
		return model;
	}

	//using requestparam annotation
/*@RequestMapping("/create")
		public ModelAndView registerSuccess(@RequestParam Map <String,String> reqParam) {
		String accountnumber=reqParam.get("accountnumber");
		String name=reqParam.get("name");	
		RegisterBean ob = new RegisterBean();
		ob.setAccountnumber(accountnumber);
		ob.setName(name);
		RegisterDao dao= new RegisterDao();
		System.out.println(dao.getTemplate());
		dao.save(ob);
		ModelAndView model = new ModelAndView("create");
		model.addObject("an", accountnumber);	
		return model;
	}
*/
	  @Autowired
	  private RegisterDao registerDao;

	@RequestMapping("/create")
	public ModelAndView registerSuccess(@ModelAttribute("register") RegisterBean registerBean) {
	
	//RegisterDao dao= new RegisterDao();
	System.out.println(registerDao.getTemplate());
	registerDao.save(registerBean);
	ModelAndView model = new ModelAndView("create");
	return model;
}

	
	
	/*@RequestMapping(value="/create",method=RequestMethod.POST)
	public ModelAndView registerSuccess(@ModelAttribute("register") RegisterBean registerBean) {
		ModelAndView model = new ModelAndView("create");
		model.addObject("msg", "Welcome to Hyderabad");
		return model;
	}*/

	
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){
		List<RegisterBean> list=registerDao.getDetails();
		return new ModelAndView("viewemp","list",list);
		
		
		
	}
	
}