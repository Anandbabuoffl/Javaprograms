package javaprogramsytax;
import java.util.Scanner;
public class Gettinginputfromuser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String s=sc.nextLine();
		System.out.println("Enter your age");
		int a=sc.nextInt();
		System.out.println("Enter your GPA");
		double b=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter your email");
		String p=sc.nextLine();
		//System.out.println("Did you complete your collage ture or flase");
		//boolean c=sc.nextBoolean();
	    //System.out.println("Enter your highest grade");
		//char e=(char) sc.nextInt();
		System.out.println(s);
		System.out.println(a);
		System.out.println(b);
		System.out.println(p);
		//System.out.println(c);
		
	

	
	}

}
