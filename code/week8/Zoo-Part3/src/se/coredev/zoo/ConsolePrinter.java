package se.coredev.zoo;

import se.coredev.zoo.animal.Animal;

public class ConsolePrinter implements AnimalPrinter {

	@Override
	public AnimalPrinter print(Animal animal) {
		System.out.println("Number:" + animal.getSerialNumber() + " Sound:" + animal.getSound());
		return this;
	}

}
