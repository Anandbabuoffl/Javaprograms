package Javaprog1;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a words");
		String w=scanner.nextLine();
		int n=w.length();
		String red="";
		
		for(int i=n-1;i>=0;i--)
		{
			red=red+w.charAt(i);
		}
        System.out.println("Reverse string "+red);
	}

}
