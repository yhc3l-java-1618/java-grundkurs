package se.coredev.week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public final class Main {

	public static void main(String[] args) {
		
		// Writer
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("values.txt"))) {
			writer.write("Hello");
			writer.newLine();
			writer.write("World!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		// Read
		try (BufferedReader reader = new BufferedReader(new FileReader("values.txt"))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
