package progs;

public class Swapnumbers {
	
	static int a=10,b=20;
	
	static void swapnum() {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
	}

	public static void main(String[] args) {
		swapnum();

	}

}
