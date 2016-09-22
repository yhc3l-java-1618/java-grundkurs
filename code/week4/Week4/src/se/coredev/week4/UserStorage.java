package se.coredev.week4;

import java.util.Arrays;

public final class UserStorage {

	private User[] users;
	private int nextIndex;

	public UserStorage() {
		this.users = new User[10];
		this.nextIndex = 0;
	}

	public static void main(String[] args) {

		UserStorage userStorage = new UserStorage();
		try {
			userStorage.addUser(new User("anca007"));
			User user = userStorage.getUser("anca01");
			System.out.println(user.getUsername());
		}
		catch (UserStorageException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Number of users in storage:" + userStorage.numberOfUsersInStorage());
	}

	public void addUser(User user) throws UserStorageException {

		if (user.getUsername().length() < 7) { throw new UserStorageException("Username: " + user.getUsername() + " is too short."); }

		users[nextIndex++] = user;

		if (needToExpandStorage()) {
			expandStorage();
		}
	}

	public User getUser(String username) throws UserStorageException {
		for (User user : users) {
			if (user != null && user.getUsername().equals(username)) { return user; }
		}
		throw new UserStorageException("Could not find user with username: " + username + " in storage");
	}

	public int numberOfUsersInStorage() {
		int numberOfUsers = 0;

		for (User user : users) {
			if (user == null) {
				break;
			}
			numberOfUsers++;
		}
		return numberOfUsers;
	}

	public User[] getUsers() {
		return Arrays.copyOf(users, users.length);
	}

	private void expandStorage() {
		users = Arrays.copyOf(users, users.length + 10);
	}

	private boolean needToExpandStorage() {
		return users.length == nextIndex;
	}

}
