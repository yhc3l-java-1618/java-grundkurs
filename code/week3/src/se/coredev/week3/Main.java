package se.coredev.week3;

public final class Main {

	public static void main(String[] args) {

		Dog dog = new Dog("Fido");
		Dog dogCopy = new Dog("Fido");
		
		System.out.println("dog == dogCopy ? " + (dog == dogCopy));
		System.out.println("dog.equals(dogCopy) ? " + (dog.equals(dogCopy)));
		
//		Zoo zoo = new Zoo();
//		
//		zoo.addAnimal(new Dog());
//		zoo.addAnimal(new Dog());
//		zoo.addAnimal(new Dog());
//		zoo.addAnimal(new Dog());
//		zoo.addAnimal(new Cat());
//		zoo.addAnimal(new Lion());
//		zoo.addAnimal(new Cat());
//		zoo.addAnimal(new Lion());
//		zoo.addAnimal(new Lion());
//		zoo.addAnimal(new Dog());
//
//		zoo.hearAnimalSound();
		
		
		
	}

}
