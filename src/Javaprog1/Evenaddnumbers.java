package Javaprog1;

import java.util.Scanner;

public class Evenaddnumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int red=0;
		int countodd=0;
        int counteven=0;
		
		while(num>0) {
			red=num%10; //1234 4
			if(red%2==0) {
				countodd++;
			}else if(red%2!=0) {
				counteven++;
				}
			num=num/10;
			}
		System.out.println("Even num is "+countodd);
		System.out.println("odd num is "+counteven);
		}
	}


