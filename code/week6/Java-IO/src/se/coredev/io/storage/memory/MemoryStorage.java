package se.coredev.io.storage.memory;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import se.coredev.io.storage.Storage;

public final class MemoryStorage<T> implements Storage<T> {

	private final Set<T> values;
	private final Storage<T> storage;

	public MemoryStorage() {
		this(null);
	}

	public MemoryStorage(Storage<T> userStorage) {
		this.storage = userStorage;
		this.values = restore();
	}

	private Set<T> restore() {
		return storage == null ? new HashSet<>() : storage.getAll();
	}

	@Override
	public void add(T value) {
		if (storage != null) {
			storage.add(value);
		}
		values.add(value);
	}

	@Override
	public void add(Collection<T> values) {
		if (storage != null) {
			storage.add(values);
		}
		this.values.addAll(values);
	}

	@Override
	public Set<T> getAll() {
		return new HashSet<>(values);
	}
}
