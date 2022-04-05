package javaprograms;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
        String st=scanner.next();
         int len=st.length(); 
         String orginalstring=st;
         
         String rev="";
         
         for(int i=len-1;i>=0;i--) {
        	rev=rev+st.charAt(i);
        	
         }
        
     if(orginalstring.equals(rev)) {
    	 System.out.println(orginalstring+ " is palindrome string");
     }
     else {
    	 System.out.println(orginalstring+" is not palindrome string");
     }
	}

}
