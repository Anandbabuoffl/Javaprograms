package javaprograms;

import java.util.Scanner;

public class Palindromenumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		//int rev=0;
		
		int orginalnumber=num;
		
		/*
		 * while(num!=0) { rev=rev*10+num%10; num=num/10; }
		 */
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev= sb.reverse();
		
		 
		if(String.valueOf(orginalnumber) == String.valueOf(rev)) {
			System.out.println(orginalnumber+" is palindrome number");
		}
		else {
			System.out.println(orginalnumber+" is palindrome not number");
		}
	}

}
