package se.coredev.week3.recap;

public final class Dog extends Animal {

	public Dog(String id, String name) {
		super(id, name);
	}

	@Override
	public String sound() {
		return "Woff!";
	}

}
