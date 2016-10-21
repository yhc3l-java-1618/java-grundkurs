package se.coredev.zoo;

import se.coredev.zoo.animal.Animal;

public final class AnimalStorageException extends Exception {

	private static final long serialVersionUID = 238087250216070503L;

	private final Animal animal;
	
	public AnimalStorageException(Animal animal, String message) {
		super(message);
		this.animal = animal;
	}
	
	public Animal getAnimal() {
		return animal;
	}
	
}
