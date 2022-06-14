package Javaprog1;

import java.util.Scanner;

public class Convertlowtouppcases {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the word");
		String w=scanner.nextLine();
		char chararry[]=w.toCharArray();
		
		for(int i=0;i<chararry.length;i++)
		{
			if(chararry[i]>65 && chararry[i]<90){
				
			
			chararry[i]=(char) (chararry[i]+32);
		}
		}
		for(int i=0;i<chararry.length;i++) {
		System.out.print(chararry[i]);	
		}
		
		for(int j=0;j<chararry.length;j++) {
			if(chararry[j]>97 && chararry[j]<122) {
				chararry[j]=(char) (chararry[j]-32);
			}
			
		}
		for(int j=0;j<chararry.length;j++) {
			System.out.print(chararry[j]);
		}
	}

}
