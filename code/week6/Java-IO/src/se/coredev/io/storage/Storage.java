package se.coredev.io.storage;

import java.util.Collection;
import java.util.Set;

public interface Storage<T> {

	void add(T value);

	void add(Collection<T> values);

	Set<T> getAll();
}
