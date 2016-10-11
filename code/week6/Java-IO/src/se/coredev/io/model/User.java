package se.coredev.io.model;

public final class User {

	private final String id;
	private final String username;
	private final String role;

	public User(String id, String username, String role) {
		this.id = id;
		this.username = username;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return id + ";" + username + ";" + role;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) { return true; }

		if (other instanceof User) {
			User otherUser = (User) other;
			return id.equals(otherUser.id) && username.equals(otherUser.username) && role.equals(otherUser.role);
		}
		return false;
	}

	@Override
	public int hashCode() {

		int result = 1;
		result += id.hashCode() * 37;
		result += username.hashCode() * 37;
		result += role.hashCode() * 37;

		return result;
	}
}
