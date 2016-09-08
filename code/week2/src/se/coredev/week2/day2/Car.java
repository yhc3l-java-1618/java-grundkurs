package se.coredev.week2.day2;

public final class Car extends Vehicle {

	public Car() {
		super("BMW 530XD");
		System.out.println("Car default constructor called");
	}

	@Override
	public void accelerate() {
		System.out.println("Car accelerate");
		super.accelerate();
	}
	
	public void stop(){
		System.out.println("Car stop called");
	}

}
