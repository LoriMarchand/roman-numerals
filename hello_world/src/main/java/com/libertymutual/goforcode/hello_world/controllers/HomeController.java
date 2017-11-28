package com.libertymutual.goforcode.hello_world.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String defaultPage() {
		return "default";
	
	}
	
	@RequestMapping("/dynamic.html")
	public ModelAndView dynamicPage(String firstName) {
		ModelAndView bacon = new ModelAndView();
		bacon.setViewName("sirloin");

		if (firstName == null || firstName.length() == 0) {
			bacon.addObject("name", "Curtis");
		} else {
			bacon.addObject("name", firstName);
		}

		bacon.addObject("personalAffect", "hair");
		bacon.addObject("arbitraryImage", "http://via.placeholder.com/350x150");
		return bacon;
	
	}
}