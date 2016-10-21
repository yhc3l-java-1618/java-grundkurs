package se.coredev.zoo;

import se.coredev.zoo.animal.Cat;
import se.coredev.zoo.animal.Cobra;
import se.coredev.zoo.animal.Lion;

public final class Main {

	public static void main(String[] args) {

		AnimalPrinter printer = new ConsolePrinter();
		Zookeeper zookeeper = new Zookeeper(Zookeeper.DEFAULT_PRINTER);
		
		new Zoo(true, printer).addListener(zookeeper)
		             .addAnimal(new Cat("1001", "Mia"))
		             .addAnimal(new Lion("2002", "Luke"))
		             .addAnimal(new Lion("2003", "Luke"))
		             .addAnimal(new Lion("2004", "Luke"))
		             .addAnimal(new Cat("1001", "Mia"))
		             .addAnimal(new Lion("2005", "Luke"))
		             .addAnimal(new Lion("2007", "Luke"))
		             .addAnimal(new Lion("2010", "Luke"))
		             .addAnimal(new Lion("2008", "Luke"))
		             .addAnimal(new Lion("2006", "Luke"))
		             .addAnimal(new Lion("2009", "Luke"))
//		             .addAnimal(new Cobra("3003", "Darth"))
		             .hearAnimalSound();

	}

}
