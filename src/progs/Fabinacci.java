package progs;

import java.util.Scanner;

public class Fabinacci {
	
	static int n1=0,n2=1,sum=0;
	
	static void fabci(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=scanner.nextInt();
		System.out.print(n1+" "+n2);
		for(int i=0;i<num;i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
	}

	public static void main(String[] args) {
		Fabinacci.fabci();

	}

}
