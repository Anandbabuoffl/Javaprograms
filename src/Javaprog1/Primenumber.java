package Javaprog1;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int count=0;
		
		for(int i=1;i<num;i++)
			if(i%2==0)
			{
				count++;
			}
		if(count==2) {
			System.out.println(num+ " prime number");
		}else {
			System.out.println(num+ " not prime number");
		}

	}

}
