package se.coredev.week4.recap;

public final class Thing {

	private String id;
	private String description;

	public Thing(String id, String description) {
		this.id = id;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) { return true; }
		if (other instanceof Thing) { return id.equals(((Thing) other).id); }
		return false;
	}

	@Override
	public int hashCode() {
		int result = 1;
		result += id.hashCode() * 37;
		return result;
	}
}
