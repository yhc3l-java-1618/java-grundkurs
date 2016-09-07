package se.coredev.week2.day1;


public class Main {

	public static void main(String[] args) {
		
		ContactInfo contactInfo = new ContactInfo("master@universe.com");
		User user = new User("Master", "secret", contactInfo);
		
		System.out.println("Username: " + user.getUsername() + " Password: " + user.getPassword() + " Email: " + user.getContactInfo().getEmail());
		
	}
}
