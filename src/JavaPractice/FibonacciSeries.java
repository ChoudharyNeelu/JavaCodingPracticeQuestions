package JavaPractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int seqLength = scan.nextInt();
		scan.close();

		for (int i = 0; i < seqLength; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int count) {
		if (count <= 1) {
			return count;
		} else {
			return fibonacci(count - 1) + fibonacci(count - 2);
		}

	}

}
