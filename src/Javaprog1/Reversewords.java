package Javaprog1;

import java.util.Scanner;

public class Reversewords {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the words");
		String w=scanner.nextLine();
		
		String rev="";
		
		String[] word=w.split(" ");
		
		for(int i=word.length-1;i>=0;i--) {
			rev=rev+word[i]+" ";
		}
		System.out.println(rev);
	}

}
