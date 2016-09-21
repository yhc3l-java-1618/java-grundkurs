package se.coredev.zoo;

import java.util.Arrays;

import se.coredev.zoo.animal.Animal;
import se.coredev.zoo.animal.Dangerous;

public final class AnimalStorage {

	public static final int INCREASE_FACTOR = 5;
	private final boolean disallowDangerousAnimals;
	private Animal[] animals;
	private int nextFreeIndex;

	public AnimalStorage(boolean disallowDangerousAnimals) {
		this.disallowDangerousAnimals = disallowDangerousAnimals;
		this.animals = new Animal[INCREASE_FACTOR];
		this.nextFreeIndex = 0;
	}

	public void addAnimal(Animal animal) {
		if (disallowDangerousAnimals && animal instanceof Dangerous) {
			System.out.println(animal + " is dangerous and is not allowed in this zoo");
		}
		else if (existsInStorage(animal)) {
			System.out.println(animal + " already in storage");
		}
		else {
			if (needToExpandStorage()) {
				animals = getExpandeStorage();
			}
			animals[nextFreeIndex++] = animal;
		}
	}
	
	public Animal[] getAnimals(){
		return Arrays.copyOf(animals, animals.length);
	}

	private Animal[] getExpandeStorage() {
		return Arrays.copyOf(animals, animals.length + INCREASE_FACTOR);
	}

	private boolean needToExpandStorage() {
		return nextFreeIndex >= animals.length;
	}

	private boolean existsInStorage(Animal animal) {
		for (Animal storedAnimal : animals) {
			if (animal.equals(storedAnimal)) { return true; }
		}
		return false;
	}

}