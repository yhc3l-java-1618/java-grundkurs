package se.coredev.week3.recap;

public abstract class Animal {

	private final String id;
	private final String name;

	public Animal(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public abstract String sound();

	@Override
	public boolean equals(Object other) {
		
		if (other instanceof Animal) {
//			if (other != null && this.getClass().equals(other.getClass())) {
			Animal otherAnimal = (Animal) other;
			return this.id.equals(otherAnimal.id) && this.name.equals(otherAnimal.name);
		}

		return false;
	}
}
