package javaprogramsytax;

import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {
		int ar[]=new int[5];
		//int ar1[][]=new int[2][3];
		int i;
		int a[]= {10,11,12,13,14,15};//we can store any of elements in an array
		
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
		
		System.out.println(ar.length);//it will return length of an array
		
		System.out.println();
		
		for(i=0;i<=4;i++)
		{
			System.out.println(ar[i]);//for loop
		}
		System.out.println();
		for (int c:ar)
		{
			System.out.println(c);//for each loop
		}
		System.out.println();
		
	System.out.println(ar[3]);//normal array 
	
for(int b:a)
{
	System.out.println(b);
}
	}

}
