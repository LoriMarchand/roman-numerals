package com.lmig.gfc.whoops.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

public class Whoops {

	@Controller
	public class WhoopsController {

		@PostMapping("/handle-error")
		public ModelAndView handleError(String message) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("whoops");

			try {
				mv.addObject("mangledMessage", message.substring(3, 17).toUpperCase());
			} catch(IndexOutOFBoundsException ioobe) {
				mv.addObject("error", ioobe);
				mv.addObject("mangledMessage", "Hey, put i at least 17 lettes.");
			} catch(Exception e) {
				
			}
			return mv;
		}

		@GetMapping("/")
		public ModelAndView showForm() {
			ModelAndView mv = new ModelAndview();
			mv.setViewName("whoops");
			return mv;

		}

	}

}
