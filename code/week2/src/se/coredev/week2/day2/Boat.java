package se.coredev.week2.day2;

public class Boat extends Vehicle {

	public Boat() {
		super("Buster");
		System.out.println("Boat constructor called");
	}
	
	@Override
	public void accelerate() {
		System.out.println("Boat accelerate");
	}
	
}
