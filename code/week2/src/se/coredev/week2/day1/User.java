package se.coredev.week2.day1;

public class User {

	private String username;
	private String password;
	private ContactInfo contactInfo;

	public User(String username, String password, ContactInfo contactInfo) {
		// TOOD: Check username & password in the future
		this.username = username;
		this.password = password;
		this.contactInfo = contactInfo;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

}
