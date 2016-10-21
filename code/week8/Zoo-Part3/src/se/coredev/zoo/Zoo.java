package se.coredev.zoo;

import java.util.HashSet;
import java.util.Set;

import se.coredev.zoo.animal.Animal;

public final class Zoo {

	private final AnimalStorage wildAnimals;
	private final AnimalStorage domesticAnimals;
	private final AnimalPrinter printer;
	private final Set<ZooListener> listeners;
	
	public Zoo(boolean disallowDangerousAnimals, AnimalPrinter printer) {
		this.wildAnimals = new AnimalStorage(disallowDangerousAnimals);
		this.domesticAnimals = new AnimalStorage(disallowDangerousAnimals);
		this.printer = printer;
		this.listeners = new HashSet<>();
	}
	
	public Zoo addListener(ZooListener listener){
		listeners.add(listener);
		return this;
	}

	public Zoo addAnimal(Animal animal) {

		if ("".equals(animal.getName()) || animal.getName() == null) { throw new IllegalArgumentException("Missing name"); }

		try {
			switch (animal.getType()) {
			case WILD:
				wildAnimals.addAnimal(animal);
				break;
			case DOMESTIC:
				domesticAnimals.addAnimal(animal);
				break;
			default:
				break;
			}
			notifyListeners(animal);
			return this;
		}
		catch (AnimalStorageException e) {
			throw new IllegalArgumentException(e.getMessage(), e);
		}
	}
	
	private void notifyListeners(Animal animal){
		// Java 8
		listeners.forEach(listener -> listener.animalAdded(animal));
		// Java 7
//		for (ZooListener listener : listeners) {
//			listener.animalAdded(animal);
//		}
	}

	public void hearAnimalSound() {
		hearAnimalSound(wildAnimals);
		hearAnimalSound(domesticAnimals);
	}

	private void hearAnimalSound(AnimalStorage animals) {
		for (Animal animal : animals.getAnimals()) {
			if (animal == null) {
				break;
			}
			printer.print(animal);
		}
	}

}
