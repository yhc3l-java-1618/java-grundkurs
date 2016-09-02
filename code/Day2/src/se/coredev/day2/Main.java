package se.coredev.day2;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		for (int i = 1; i < 6; i++) {

			switch (i) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			default:
				System.out.println("Not 1-3");
				break;
			}

			// if (i == 1) {
			// System.out.println("One");
			// }
			// else if (i == 2) {
			// System.out.println("Two");
			// }
			// else if (i == 3) {
			// System.out.println("Three");
			// } else {
			// System.out.println("Not 1-3");
			// }
		}
		System.out.println("-------------------------------");
	}
}
