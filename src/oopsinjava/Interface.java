package oopsinjava;

import java.util.Scanner;

interface Join
{
	int ph=0;
	int pw=0;
	
	void reg();			
}
public class Interface implements Join
{
	public void reg()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your PH");
		int ph=sc.nextInt();
		System.out.println("Enter your PW");
		int pw=sc.nextInt();
		System.out.println(ph);
		System.out.println(pw);
	}

	public static void main(String[] args) {
		Join obj=new Interface();
		obj.reg();
		

	}
}