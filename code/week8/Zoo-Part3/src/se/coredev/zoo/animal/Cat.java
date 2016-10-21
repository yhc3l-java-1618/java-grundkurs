package se.coredev.zoo.animal;

public final class Cat extends Animal {

	public Cat(String serialNumber, String name) {
		super(serialNumber, name, Type.DOMESTIC);
	}

	@Override
	public String getSound() {
		return "Mjauuuuooo...";
	}

}
