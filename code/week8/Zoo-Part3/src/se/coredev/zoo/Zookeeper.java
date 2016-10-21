package se.coredev.zoo;

import java.util.HashSet;
import java.util.Set;

import se.coredev.zoo.animal.Animal;

public final class Zookeeper implements ZooListener {

	public static final AnimalPrinter DEFAULT_PRINTER = new AnimalPrinter() {
		
		@Override
		public AnimalPrinter print(Animal animal) {
			System.out.println("Animal:" + animal.getSerialNumber() + "added");
			return this;
		}
	};
	
	private final Set<String> journal;
	private final AnimalPrinter printer;
	
	public Zookeeper(AnimalPrinter printer){
		journal = new HashSet<>();
		this.printer = printer;
	}
	
	@Override
	public void animalAdded(Animal animal){
		journal.add("Animal:" + animal.getSerialNumber() + " added");
		printer.print(animal);
	}
	
	
	
}
