package Javaprog1;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int sum=0;
		while(num>0) {
			sum=sum+num%10; //125
			num=num/10;
		}
		System.out.println(sum);
	}

}
