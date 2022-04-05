package javaprograms;

import java.util.Scanner;

public class Numbersofdigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the digits");
        int num=scanner.nextInt();
        int count=0;
        
        for(int i=0;num>0;) {  
        	num=num/10;
        	count++;
        }
        System.out.println("Number of digits is "+count);
        
	}

}
