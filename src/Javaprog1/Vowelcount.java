package Javaprog1;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scanner.nextLine();
		
		String count="";
		
		String s1=s.toLowerCase();
		
		for(int i=0;i<s.length();i++)
		{
		     if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' ||
		    		 s1.charAt(i)=='u')
		{
		     count=count+s1.charAt(i);
		     
		}
		}
		System.out.println(count);
		scanner.close();
	}

}
