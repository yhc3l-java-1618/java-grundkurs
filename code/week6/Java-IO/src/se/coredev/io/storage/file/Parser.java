package se.coredev.io.storage.file;

public interface Parser<T> {

	T asType(String string);

	String asString(T value);
}
