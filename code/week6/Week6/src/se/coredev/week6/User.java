package se.coredev.week6;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public final class User implements Serializable {

	private static final long serialVersionUID = -286525467924333140L;

	private final String username;
	private final String password;
	private transient Date date;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.date = new Date();
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public Date getDate() {
		return date;
	}
	private void writeObject(ObjectOutputStream out) throws IOException {
		System.out.println("write");
		out.defaultWriteObject();
		out.writeLong(date.getTime());
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		System.out.println("read");
		in.defaultReadObject();
		date = new Date(in.readLong());
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) { return true; }
		if (other instanceof User) {
			User otherUser = (User) other;
			return username.equals(otherUser.username) & password.equals(otherUser.password);
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 1;
		result += 37 * username.hashCode();
		result += 37 * password.hashCode();
		return result;
	}

}
