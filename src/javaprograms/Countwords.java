package javaprograms;

import java.util.Scanner;

public class Countwords {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the words");
		String words=scanner.nextLine();
		int n=words.length();
		 int count=1;
		 
		for(int i=0;i<n-1;i++) {
			if((words.charAt(i)==' ') && (words.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println("Number of words is "+count);
	}

}
