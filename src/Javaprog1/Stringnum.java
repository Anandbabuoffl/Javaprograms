package Javaprog1;

import java.util.Scanner;

public class Stringnum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scanner.nextLine();
		
		int digit=0;
		
		for(int i=0;i<s.length();i++)
		{
			Character character=s.charAt(i);
			if(character.isDigit(character)) {
				digit=digit+character.getNumericValue(character);
			}
		}
        System.out.println(digit);
	}

}
