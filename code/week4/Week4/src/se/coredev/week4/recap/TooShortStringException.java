package se.coredev.week4.recap;

public final class TooShortStringException extends Exception {

	private static final long serialVersionUID = -1212658309331724575L;

	public TooShortStringException(String message) {
		super(message);
	}

}
