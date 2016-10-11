package se.coredev.week6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class Main {

	public static void main(String[] args) {

		// Write Object
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("users.txt"))) {
			out.writeObject(new User("master", "secret"));
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}

		
		// Read Object
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("users.txt"))){
			User user = (User) in.readObject();
			System.out.println(user.getUsername() + ", " + user.getPassword() + ", " + user.getDate());
		} catch(IOException | ClassNotFoundException e){
			throw new RuntimeException(e);
		}
		
		
		
		
		
		
		
		
		// // Writer
		// try (BufferedWriter writer = new BufferedWriter(new
		// FileWriter("values.txt"))) {
		// writer.write("Hello");
		// writer.newLine();
		// writer.write("World!");
		// }
		// catch (IOException e) {
		// e.printStackTrace();
		// }
		//
		// // Read
		// try (BufferedReader reader = new BufferedReader(new
		// FileReader("values.txt"))) {
		// String line = null;
		// while ((line = reader.readLine()) != null) {
		// System.out.println(line);
		// }
		// }
		// catch (IOException e) {
		// e.printStackTrace();
		// }

	}

}
