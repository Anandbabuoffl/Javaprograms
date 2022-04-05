package javaprograms;

import java.util.Scanner;

public class Largestof3numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = scanner.nextInt();
		
		System.out.println("Enter the numbers");
		int b = scanner.nextInt();
		
		System.out.println("Enter the numbers");
		int c = scanner.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" a is the largest");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" b is the largest");
		}else {
			System.out.println(c+" c is the largest");
		}

	}

}
