package javaprogramsytax;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Diffpatterns {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print(" *");
			}
		
		 for(j=i;j<=5;j++) 
		 { 
			 if(j==4||j==5)
			 System.out.print("* ");
			 else
			 {
				 System.out.println(" ");
			 }
		 } 
		 for(j=1;j<=i;j++)
		 {
		  System.out.print("* ");
		  } 
		 System.out.println();
		 }
		 

}
}
