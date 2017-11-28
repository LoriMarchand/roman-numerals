package com.libertymutual.goforcode.vicious_valet.models;

import java.util.ArrayList;

public class Lot {

	private ArrayList<Car> carList;
	private int capacity = 5;

	public Lot() {
		carList = new ArrayList<Car>();

	}

	public void removeCarFromLot(int index) {
		carList.remove(index - 1);
	}

	public void driveCarOnto(Car a) {
		if (isLotFull() == false) {
			carList.add(a);
		}

	}

	public boolean isLotFull() {
		if (carList.size() < capacity) {
			return false;
		} else {
			return true;
		}
	}

	public ArrayList<Car> getCarList() {
		return carList;

	}
}
