package se.coredev.zoo.animal;

public abstract class Animal {

	private final String serialNumber;
	private final String name;
	private final Type type;

	public Animal(String serialNumber, String name, Type type) {
		this.serialNumber = serialNumber;
		this.name = name;
		this.type = type;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) { return true; }

		if (other instanceof Animal && getClass().equals(other.getClass())) {
			Animal otherAnimal = (Animal) other;
			return serialNumber.equals(otherAnimal.serialNumber) &&
			        name.equals(otherAnimal.name) && type.equals(otherAnimal.type);
		}

		return false;
	}

	@Override
	public String toString() {
		return String.format("Serial number:%s, Name:%s, Type:%s", serialNumber, name, type);
	}

	public abstract String getSound();

	public static enum Type {
		WILD, DOMESTIC
	}

}
