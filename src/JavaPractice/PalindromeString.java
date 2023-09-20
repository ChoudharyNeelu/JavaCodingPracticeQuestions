package JavaPractice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		palindrome(str);

	}

	public static void palindrome(String str) {
		String newstr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			newstr = newstr + str.charAt(i);
		}

		if (newstr.equals(str)) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}
	}

}
