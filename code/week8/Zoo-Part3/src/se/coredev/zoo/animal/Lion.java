package se.coredev.zoo.animal;

public final class Lion extends Animal{

	public Lion(String serialNumber, String name) {
		super(serialNumber, name, Type.WILD);
	}

	@Override
	public String getSound() {
		return "Wrouww...w..grrr";
	}

}
