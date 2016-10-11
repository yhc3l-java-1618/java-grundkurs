package se.coredev.io.service;

public interface Printer {

	// Java 8 feature
	default void printLine(String string) {
		System.out.println(string);
	}
}
