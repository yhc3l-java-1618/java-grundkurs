package se.coredev.zoo.animal;

public final class Cobra extends Animal implements Dangerous {

	public Cobra(String serialNumber, String name) {
		super(serialNumber, name, Type.WILD);
	}

	@Override
	public String getSound() {
		return "Pssszzz...sss..z...";
	}

	@Override
	public boolean attack(Animal animal) {
		return animal.getType().equals(Type.DOMESTIC);
	}

}
