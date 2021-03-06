package com.libertymutual.goforcode.rentals.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.rentals.models.Car;
import com.libertymutual.goforcode.rentals.models.Fleet;

@Controller
public class RentalController {

	private Fleet fleet;

	public RentalController() {
		fleet = new Fleet();

	}

	@RequestMapping("/")
	public ModelAndView showMainPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("fleet", fleet);
		mv.addObject("showLowCarError", fleet.getAvailableCars().size() < 5);
		return mv;
	}

	@RequestMapping("/rent")
	public ModelAndView rentCar(int index) {
		fleet.makeCarUnavailable(index - 1);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/");
		return mv;
	}

	@RequestMapping("/return")
	public ModelAndView returnCar(int index) {
		fleet.makeCaravailable(index - 1);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/");
		return mv;
	}

	@RequestMapping("/add_car")
	public ModelAndView showAddCarForm(String make, String model, String year) {
		if (make != null && !make.isEmpty() && model != null && !model.isEmpty() && year != null && !year.isEmpty()) {

			Car car = new Car(make, model, year);
			fleet.addCar(car);

			ModelAndView mv = new ModelAndView();
			mv.setViewName("redirect:/");
			return mv;

		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("addCarForm");
		return mv;
	}

}
