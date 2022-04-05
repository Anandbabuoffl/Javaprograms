package oopsinjava;

import java.util.Scanner;

interface Trip1{
	String loc=null;
	int amt=0;
	int noofdays=0;
	void display();
}
interface Trip2 
{
String loc=null;
int amt=0;
int noofdays=0;
void show();
}

public class Interface2 implements Trip1,Trip2
{
public void display()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your destination");
	String loc=sc.nextLine();
	System.out.println("Enter your amount");
	int amt=sc.nextInt();
	System.out.println("Enter your noofdays");
	int noofday=sc.nextInt();	
	System.out.println(loc);
	System.out.println(amt);
	System.out.println(noofday);
}
public void show() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your destination");
	String loc=sc.nextLine();
	System.out.println("Enter your amount");
	int amt=sc.nextInt();
	System.out.println("Enter your noofdays");
	int noofday=sc.nextInt();
	System.out.println(loc);
	System.out.println(amt);
	System.out.println(noofday);
}
	public static void main(String[] args) {
	 Interface2 obj=new Interface2();
		obj.display();
		obj.show();
		
		
		
	}

}
