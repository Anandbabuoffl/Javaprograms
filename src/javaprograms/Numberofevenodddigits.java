package javaprograms;

import java.util.Scanner;

public class Numberofevenodddigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num = scanner.nextInt();
		int evencount = 0;    
		int oddcount = 0;

		while (num > 0) { // 1234
			int red = num % 10; // 1234%10  quotient=123 reminder=4 
			if (red % 2 == 0) {                                           //4%2=2 0  3%2=1  1
				evencount++;
			} else {
				oddcount++;

			}
			num = num / 10; //1234/10 =123
		}
		System.out.println("Number of even digits is " + evencount);
		System.out.println("Number of odd digits is " + oddcount);
	}

}
