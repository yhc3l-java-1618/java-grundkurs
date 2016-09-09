package se.coredev.week2.recap;

public final class User {

	private final String username;
	private final String password;
	private String role;

	public User(String username, String password) {
		this(username, password, "Guest");
	}

	public User(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = isValidRole(role) ? role : "Guest";
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {

		if (isValidRole(role)) {
			this.role = role;
		}
	}

	private static boolean isValidRole(String role) {
		switch (role) {
		case "Admin":
			return true;
		case "Super":
			return true;
		case "Guest":
			return true;
		default:
			return false;
		}
	}

}
