package se.coredev.week4;

public final class UserStorageException extends Exception {

	private static final long serialVersionUID = 8346194621429747188L;

	public UserStorageException(String message) {
		super(message);
	}

	public UserStorageException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
