package se.coredev.week3.recap;

public class User {

	//		User			User user = new User("1001", "yoda", "master");
	// 		  |
	//	  GrandUser
	//		  |
	//	   MegaUser			MegaUser megaUser = new MegaUser("1001", "yoda", "master", .....);  
	//
	//						megaUser instanceof User ==> true | false
	//						megaUser.equals(user) ==> true | false
	
	private final String id;
	private final String username;
	private final String password;

	public User(String id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public boolean equals(Object other) {
		
		if(other instanceof User && this.getClass().equals(other.getClass())) {
			User user = (User) other;
			return id.equals(user.id) && username.equals(user.username);
		}
		
		return false;
	}
	
}















