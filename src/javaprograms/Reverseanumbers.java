package javaprograms;

import java.util.Scanner;

public class Reverseanumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();

		// using algorithm
		/*
		 * int rev=0;
		 * 
		 * while(num!=0)
		 *  {
		 *   rev=rev*10 + num%10; //0*10+1234%10=4 
		 *   num=num/10;   //1234/10=123 
		 * }
		 * 
		 * System.out.println("Reverse number is "+rev);
		 */

		// using stringbuffer class

		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();

		System.out.println("Reverse number is " + rev);
	}

}
