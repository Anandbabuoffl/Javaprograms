package Javaprog1;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
        String s=scanner.next();
        String  org_s=s;
        
        int length=s.length();
        String rev="";
        
        for(int i=length-1;i>=0;i--) {
        	
        	rev=rev+s.charAt(i);
        }
		System.out.println(rev);
		
		if(rev.equals(org_s)) {
			System.out.println("Palindrome");
			}
			else
				System.out.println("Not palindrome");
		}
	

}
