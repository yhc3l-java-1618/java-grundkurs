package se.coredev.week4;

public final class User {

	private final String username;

	public User(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public boolean equals(Object other) {

		if (this == other) { return true; }
		if (other instanceof User) { return username.equals(((User) other).username); }
		return false;
	}

}
