package Javaprog1;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scanner.nextLine();

		int count=s.length();
		String s1="";
		
		for(int i=4;i>=0;i--) {
			 s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}

}
