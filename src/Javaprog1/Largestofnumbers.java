package Javaprog1;

import java.util.Scanner;

public class Largestofnumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" A is greater");
		}
		if(b>a && b>c) {
			System.out.println(b+" B is greater");
		}
		else {
			System.out.println(c+" C is greater");
		}
		
	}

}
