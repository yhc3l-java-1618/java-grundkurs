package se.coredev.week3.recap;

public final class Zoo {

	private Animal[] animals;
	private int nextIndex;

	public Zoo() {
		animals = new Animal[5];
		nextIndex = 0;
	}

	public void addAnimal(Animal animal) {

		if (existsInStorage(animal)) {
			System.out.println("Can not store same animal twice");
		}
		else {
			animals[nextIndex] = animal;
			nextIndex++;
			System.out.println("Adding animal....");
		}

	}

	private boolean existsInStorage(Animal animalToAdd) {

		for (Animal animal : animals) {
			if (animalToAdd.equals(animal)) {
				return true;
			}
		}

		return false;
	}
}
