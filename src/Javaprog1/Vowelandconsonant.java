package Javaprog1;

import java.util.Scanner;

public class Vowelandconsonant {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the words");
		String words=scanner.nextLine();
		
		int vcount=0,ccount=0;
		
		for(int i=0;i<words.length();i++)
		
		if(words.charAt(i)=='a'||words.charAt(i)=='e'||words.charAt(i)=='i'||words.charAt(i)=='o'||
		words.charAt(i)=='u');
		vcount++;
		
		System.out.println(vcount);
	}

}
