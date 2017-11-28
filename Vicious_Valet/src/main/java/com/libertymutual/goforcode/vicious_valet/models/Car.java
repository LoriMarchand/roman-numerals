package com.libertymutual.goforcode.vicious_valet.models;

public class Car {

	private String make;
	private String license;
	private String state;
	private String color;
	private String model;

	public Car(String make, String license, String state, String color, String model) {
		this.make = make;
		this.license = license;
		this.state = state;
		this.color = color;
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public String getLicense() {
		return license;
	}

	public String getState() {
		return state;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}
}