package se.coredev.week3;

public final class Dog extends Animal {

	private final String name;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String sound() {
		return "Woff";
	}

	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Dog) {
			Dog otherDog = (Dog) other;
			return this.name.equals(otherDog.name);
		}
		
		return false;
	}
	
}
