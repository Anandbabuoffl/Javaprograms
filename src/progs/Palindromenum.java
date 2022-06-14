package progs;

import java.util.Scanner;

public class Palindromenum {
	int rev=0;
	
	void palinde() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=scanner.nextInt();
		int num_org=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(num_org==rev) 
			System.out.println("Number is palindrome");
			else
				System.out.println("Number is not a palindrome");
		
	}
	public static void main(String[] args) {
		Palindromenum pailn=new Palindromenum();
		pailn.palinde();

	}

}
