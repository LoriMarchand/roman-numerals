package com.libertymutual.goforcode.rentals.models;

public class Car {

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getYear() {
		return year;
	}

	private String make;
	private String model;
	private String year;

	public Car(String make, String model, String year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
}
