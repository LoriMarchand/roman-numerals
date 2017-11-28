package com.libertymutual.goforcode.vicious_valet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.vicious_valet.models.Car;
import com.libertymutual.goforcode.vicious_valet.models.Lot;

@Controller
public class AppController {

	private Lot carLot;

	public AppController() {
		carLot = new Lot();
	}

	@RequestMapping("/remove")
	public ModelAndView removeCar(int carIndex) {
		carLot.removeCarFromLot(carIndex);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;
	}

	@RequestMapping("/")
	public ModelAndView showApp(String license, String state, String color, String make, String model) {
		// if the license is not null and the length of the license is greater than 0
		// create a new instance of the car class from the values submitted

		if (license != null && license.length() > 0) {
			Car car;
			car = new Car(make, license, state, color, model);

			// park the card in the lot (how do we do this)
			// we need to add a method to the lot class and call that method)
			carLot.driveCarOnto(car);

		}

		ModelAndView mv;
		mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;

	}

	private int than() {
		// TODO Auto-generated method stub
		return 0;
	}

}
