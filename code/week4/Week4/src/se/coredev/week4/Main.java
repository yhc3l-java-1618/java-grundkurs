package se.coredev.week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Main {

	public static void main(String[] args) {

		User user = new User("anca01");
		
		List<User> list = new ArrayList<>();
		list.add(user);
		user = (User) list.get(1);
		
		// key -> value
		// ------------
		// "1" -> user
		
		Map<String, User> users = new HashMap<>();
		
		users.put("1", user);
		user = (User) users.get("1");
		
	}
}
