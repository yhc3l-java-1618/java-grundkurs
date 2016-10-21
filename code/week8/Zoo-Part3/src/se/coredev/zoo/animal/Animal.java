package se.coredev.zoo.animal;

public abstract class Animal implements Comparable<Animal>{

	private final String serialNumber;
	private final String name;
	private final Type type;

	public Animal(String serialNumber, String name, Type type) {
		this.serialNumber = serialNumber;
		this.name = name;
		this.type = type;
	}
	
	@Override
	public int compareTo(Animal animal) {
		return serialNumber.compareTo(animal.getSerialNumber());
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
	public int hashCode() {
		int result = 1;
		result += 37 * getClass().hashCode();
		result += 37 * serialNumber.hashCode();
		result += 37 * name.hashCode();
		result += 37 * type.hashCode();
		return result;
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
