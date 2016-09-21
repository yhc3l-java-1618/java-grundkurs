package se.coredev.zoo;

import se.coredev.zoo.animal.Animal;

public final class Zoo {

	private final AnimalStorage wildAnimals;
	private final AnimalStorage domesticAnimals;

	public Zoo(boolean disallowDangerousAnimals) {
		this.wildAnimals = new AnimalStorage(disallowDangerousAnimals);
		this.domesticAnimals = new AnimalStorage(disallowDangerousAnimals);
	}

	public Zoo addAnimal(Animal animal) {
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
		return this;
	}

	public void hearAnimalSound() {
		hearAnimalSound(wildAnimals);
		hearAnimalSound(domesticAnimals);
	}

	private static void hearAnimalSound(AnimalStorage animals) {
		for (Animal animal : animals.getAnimals()) {
			if (animal == null) {
				break;
			}
			System.out.println(animal.getSound());
		}
	}

}
