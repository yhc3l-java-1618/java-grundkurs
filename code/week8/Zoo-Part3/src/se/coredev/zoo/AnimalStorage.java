package se.coredev.zoo;

import java.util.Set;
import java.util.TreeSet;

import se.coredev.zoo.animal.Animal;
import se.coredev.zoo.animal.Dangerous;

public final class AnimalStorage {

	private final boolean disallowDangerousAnimals;
	private final Set<Animal> animals;

	public AnimalStorage(boolean disallowDangerousAnimals) {
		this.disallowDangerousAnimals = disallowDangerousAnimals;
		this.animals = new TreeSet<>();
	}

	public void addAnimal(Animal animal) throws AnimalStorageException {
		if (disallowDangerousAnimals && animal instanceof Dangerous) {
			throw new AnimalStorageException(animal, "Dangerous animal added");
		}
		animals.add(animal);
	}
	
	public Set<Animal> getAnimals(){
		return new TreeSet<>(animals);
	}

}