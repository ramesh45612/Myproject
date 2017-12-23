package com.ram;

import java.util.Map;


//import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {

@RequestMapping("/welcome.ram")	
public ModelAndView welcome()
{
	ModelAndView mav = new ModelAndView("empDetails");
	//mav.addObject("msg","Employee Details");
	return mav;
}

//@RequestMapping("/empDetails.ram")
//public ModelAndView empDetails(@RequestParam("name") String name,@RequestParam("hobby") String hobby)

//way 2 logic
/*public ModelAndView empDetails(@RequestParam Map<String,String> params)
{
	String name=params.get("name");
	String hobby=params.get("hobby");
//way 2 End	
	ModelAndView mav = new ModelAndView("empDetailsSuccess");
	mav.addObject("msg","Details of Employee");
	mav.addObject("name",name);
	mav.addObject("hobby",hobby);
	return mav; 
}*/

//way 3
@RequestMapping("/empDetails.ram")
public ModelAndView empDetails(@ModelAttribute("empdetail") empDetails emp){

	 
	ModelAndView mav = new ModelAndView("empDetailsSuccess");
	//ensure in result(empDetailsSuccess.jsp) page should be ${empdetail.name} not ${name}
		return mav;

}
//entire this controller will use this - common objects for this controller
@ModelAttribute
public void addingCommonObjects(Model model1) {
	
model1.addAttribute("headerMessage", "Wipro Limited India");
}

}
