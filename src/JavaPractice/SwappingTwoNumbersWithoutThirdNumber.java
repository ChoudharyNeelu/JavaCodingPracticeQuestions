package JavaPractice;

import java.util.Scanner;

public class SwappingTwoNumbersWithoutThirdNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// taking both numbers as a user input
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();

		System.out.println("Before Swapping: a = " + a + " & b = " + b);

		// swapping logic
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping: a = " + a + " & b = " + b);
	}

}
