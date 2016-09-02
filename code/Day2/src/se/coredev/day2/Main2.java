package se.coredev.day2;

import java.io.IOException;

public class Main2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Keep typing and pressing enter");

		char ch = ' ';
		
//		do {
//			ch = (char) System.in.read();
//			System.out.println(ch);
//			System.in.read();
//		} while (ch != 'q');
		
		
		while((ch = (char) System.in.read()) != 'q') {
			System.out.println(ch);
			System.in.read();
		}
		
		
//		for (char ch = '-'; (ch = (char) System.in.read()) != 'q';) {
//			System.out.println(ch);
//			System.in.read();
//		}
	}

}
