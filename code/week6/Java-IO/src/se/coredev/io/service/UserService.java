package se.coredev.io.service;

import java.io.IOException;
import java.util.List;

import se.coredev.io.model.User;
import se.coredev.io.storage.Storage;

public final class UserService {

	private final Storage<User> storage;
	private final Printer printer;

	public UserService(Storage<User> storage, Printer printer) {
		this.storage = storage;
		this.printer = printer;
	}

	public void save(User user) throws IOException {
		storage.add(user);
	}

	public void save(List<User> users) throws IOException {
		storage.add(users);
	}

	public void print() {
		for (User user : storage.getAll()) {
			printer.printLine(user.toString());
		}
	}
}