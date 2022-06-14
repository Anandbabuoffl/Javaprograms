package progs;

public class Factorial {
static int factorial=1;
	static void factl(int num) {
		
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}
	public static void main(String[] args) {
		factl(5);
	}

}
