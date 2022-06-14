package Javaprog1;

import java.util.Scanner;

public class Fabicocciseries {

	public static void main(String[] args) {
		
		int n1=0,n2=1,sum;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		System.out.print(n1+" "+n2);
		
		
		for(int i=2;i<=num;i++) {
			 sum=n1+n2;
			 System.out.print(" "+sum);
			 n1=n2;
			 n2=sum;
		}
		
	}

}
