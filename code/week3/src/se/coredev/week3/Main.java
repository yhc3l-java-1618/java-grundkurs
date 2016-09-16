package se.coredev.week3;

import java.io.IOException;

public final class Main {

	public static void main(String[] args) throws IOException{

//		System.out.println("Press enter to start");
//		System.in.read();
		StringBuilder builder = new StringBuilder();
		
		for (int i = 1; i < 101; i++) {
			builder.append(", ").append(i);			
		}

		System.out.println(builder.toString());
//		System.out.println("Press enter to finish");
//		System.in.read();
//		
//		System.out.println("Finished");
		
	}

	public static boolean login(String username, String password) {
		return "master".equals(username) && "secret".equals(password);
		// return username.equals("master") && password.equals("secret");
		// return username == "master" && password == "secret";
	}

}
