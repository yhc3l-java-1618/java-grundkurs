package se.coredev.io;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import se.coredev.io.model.User;
import se.coredev.io.model.UserFileInfo;
import se.coredev.io.model.UserParser;
import se.coredev.io.service.Printer;
import se.coredev.io.service.UserService;
import se.coredev.io.storage.Storage;
import se.coredev.io.storage.file.FileInfo;
import se.coredev.io.storage.file.FileStorage;
import se.coredev.io.storage.file.Parser;
import se.coredev.io.storage.memory.MemoryStorage;

public final class Main {

	public static void main(String[] args) throws IOException {

		FileInfo<User> fileInfo = new UserFileInfo("users", "users", ".txt");
		Parser<User> parser = new UserParser();
		Storage<User> storage = new MemoryStorage<>(new FileStorage<>(fileInfo, parser));
		Printer printer = new Printer() {};
		
		UserService service = new UserService(storage, printer);
		service.save(new User("1001", "anca01", "admin"));
		List<User> users = Arrays.asList(new User("1002", "yoda", "super-admin"), 
		                                 new User("1003", "leia", "guest"),
		                                 new User("1004", "luke", "guest"));
		service.save(users);
		
		service.print();
	}

}
