package JavaPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Hello World";

		reverseString(str);

		System.out.println(); // transferring control to new line

		// taking user input
		Scanner scan = new Scanner(System.in);
		String newStr = scan.nextLine();
		scan.close();
		reverseString(newStr);

	}

	public static void reverseString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
