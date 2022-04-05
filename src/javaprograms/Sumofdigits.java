package javaprograms;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num = scanner.nextInt();
		int sum = 0;
		while (num > 0) {         // 1234
			int red = num % 10;  // red=4
			sum = sum + red;     // sum=4
			num = num / 10;     // 123
		}

		System.out.println("Sumofdigits is " + sum);
	}

}
