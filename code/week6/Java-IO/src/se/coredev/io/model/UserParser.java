package se.coredev.io.model;

import se.coredev.io.storage.file.Parser;

public final class UserParser implements Parser<User> {

	@Override
	public User asType(String string) {

		if (string == null || string.trim().length() == 0) { throw new IllegalArgumentException("Invalid format. Can not create user from: " + string); }

		final String[] parts = string.split(";");

		if (parts.length == 3) {

			String id = parts[0].trim();
			String username = parts[1].trim();
			String role = parts[2].trim();

			return new User(id, username, role);
		}

		throw new IllegalArgumentException("Invalid length. Value must contain three parts separated by semicolon");
	}

	@Override
	public String asString(User value) {
		return value.getId() + ";" + value.getUsername() + ";" + value.getRole();
	}
}
