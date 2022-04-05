package javaprogramsytax;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int input=sc.nextInt();
		for(int i=0;i<=input;i+=2)
		{
			System.out.println(i);//for loop
		}
		System.out.println();
		
		System.out.println("Enter the row");
		int row=sc.nextInt();
		int i=1;
		
		while(i<=row)
		{
			System.out.println(i);//while loop
			i++;
		}
		System.out.println();
		
		System.out.println("Enter the n");
		int n=sc.nextInt();
		int j=20;
		 do
		 {
			 System.out.println(j);
			 j++;
			 }
		 while(j<=n);//do while loop
			 
		 }
		
		
	}

