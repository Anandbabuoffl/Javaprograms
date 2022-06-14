package progs;

import java.util.Scanner;

public class Palindromestring {
	
	String rev="";
	
	void palindr() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the words");
		String words=scanner.nextLine();
		String word_org=words;
		for(int i=words.length()-1;i>=0;i--) {
			rev=rev+words.charAt(i);
		}
		if(word_org.equals(rev)) 
		System.out.println("Word is palindrome");
		else
			System.out.println("Word is not palindrome");
	}

	public static void main(String[] args) {
		Palindromestring palinds=new Palindromestring();
		palinds.palindr();

	}

}
