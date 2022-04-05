package Practice;

import java.util.Scanner;

public class Conditionstatements {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int day=scanner.nextInt();
		
		if(day==1) {
			System.out.println("sunday");
		}else if(day==2) {
			System.out.println("monday");
		}
		else if(day==3) {
			System.out.println("tuesday");
		}
		else if(day==4) {
			System.out.println("wednesday");
		}
		else if(day==5) {
			System.out.println("thursday");
		}
		else if(day==6) {
			System.out.println("friday");
		}else if(day==7) {
			System.out.println("saturday");
		}else {
			System.out.println("no days found");
		}
		
		Scanner scanner1=new Scanner(System.in);
		System.out.println("Enter the number");
		int month=scanner1.nextInt();
		
		
		switch(month) {
		case 1: System.out.println("january");
		break;
		case 2: System.out.println("february");
		break;
		case 3: System.out.println("march");
		break;
		case 4: System.out.println("april");
		break;
		case 5: System.out.println("may");
		break;
		case 6: System.out.println("june");
		break;
		case 7: System.out.println("july");
		break;
		case 8: System.out.println("augest");
		break;
		case 9: System.out.println("stemper");
		break;
		case 10: System.out.println("october");
		break;
		case 11: System.out.println("november");
		break;
		case 12: System.out.println("december");
		break;
		default:System.out.println("no month found");
		}
	}

}
