package cont;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Binding {


	@RequestMapping("/test")
	public ModelAndView test() {
		ModelAndView model = new ModelAndView("binding");
		return model;
	}

	@RequestMapping("/binding")
	public ModelAndView bind(@ModelAttribute("test") Test test, BindingResult result) 
	{
		if (result.hasErrors()){
		ModelAndView model = new ModelAndView("binding");
		return model;
		}
		return null;
	
	}
}
