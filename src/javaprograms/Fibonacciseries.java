package javaprograms;

import java.util.Scanner;

public class Fibonacciseries {

	int n1=0,n2=1,sum=0;
	
	void fibonacci() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		    int num=scanner.nextInt();
		    System.out.print(n1+" "+n2);  //0 1  
		for(int i=2;i<num;i++) {     
			sum=n1+n2;                    //1   2    3
			System.out.print(" "+sum);    //1   2    3
			n1=n2;                        //1   1    2
			n2=sum;                       //1   2    3
		}
	}
	public static void main(String[] args) {
		Fibonacciseries fs=new Fibonacciseries();
		fs.fibonacci();
	}

}
