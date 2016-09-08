package se.coredev.week2.day2;

public class Vehicle {

	private String model;

	// Default constructor
	public Vehicle(String model) {
		this.model = model;
		System.out.println("Vehicle constructor called");
	}

	public void accelerate() {
		System.out.println("Vechicle accelerate");
	}
}
