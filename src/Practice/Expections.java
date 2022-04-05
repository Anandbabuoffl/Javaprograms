package Practice;

import java.io.File;

public class Expections {

	public static void main(String[] args) throws InterruptedException {
	 int a=3,b=5,c;
	 
	c=a+b;
	try {
		System.out.println(c/0);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	

	String st="asbljadsc";
	
	try {
	
		int i=Integer.parseInt(st);
		System.out.println(i);
	}catch(Exception e1) {
	System.out.println(e1.getMessage());
	}
	finally {
		System.out.println("test");
	}
	
	
		Thread.sleep(4000);
	
		
	
	
	
	
	System.out.println("Test1");
	}

}
