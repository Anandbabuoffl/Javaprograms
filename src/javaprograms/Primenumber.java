package javaprograms;

import java.util.Scanner;

public class Primenumber {
	int count = 0;

	void primenumornot() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		    int num=scanner.nextInt();   //2
		    if(num>1) 
		    {
		    for(int i=1;i<=num;i++) {
		    	if(num%i==0) 
		    		 count++;
		    }
		    	if(count==2) {
		    		System.out.println(num+" is prime number");
		    	}
		    	else {
		    		System.out.println(num+" not prime number");
		    	}
		    }
		  
		    else {
		    	 System.out.println(num+" not prime number");
		    
		    }
		    	}
		    

	public static void main(String[] args) {
		Primenumber pn = new Primenumber();
		pn.primenumornot();

	}
		    }
