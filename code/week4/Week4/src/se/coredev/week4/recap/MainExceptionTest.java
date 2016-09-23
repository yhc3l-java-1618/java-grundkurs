package se.coredev.week4.recap;

public final class MainExceptionTest {

	public static void main(String[] args) {

		try {
			thrower("Ö1234");
			System.out.println("After thrower");
		}
		catch (TooShortStringException e) {
			System.out.println("1:" + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("2:" + e.getMessage());
		}
		finally {
			System.out.println("Finally");
		}

		System.out.println("Finished!");

	}

	public static void thrower(String value) throws Exception {
		if (value.length() < 5) { throw new TooShortStringException("Too short string"); }
		if (value.startsWith("Ö")) { throw new Exception("Ö is bad"); }
		
		System.out.println("In thrower");
	}

}
