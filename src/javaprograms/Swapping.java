package javaprograms;

public class Swapping {

	public static void main(String[] args) {
		int a = 10, b = 20;

		System.out.println("Before swapping the value of a is " + a + " & b is " + b);
		// using third variable

		int s = a;
		a = b;
		b = s;
		System.out.println("After swapping the value of a is " + a + " & b is " + b);

		// without using third variable

		/*
		 * a = a + b; b = a - b; a = a - b;
		 * System.out.println("After swapping the value of a is " + a + " & b is " + b);
		 */

		/*
		 * a=a*b; b=a/b; a=a/b; System.out.println("After swapping the value of a is " +
		 * a + " & b is " + b);
		 */

		// single statement

		/*
		 * b=a+b-(a=b); System.out.println("After swapping the value of a is " + a +
		 * " & b is " + b);
		 */
	}

}
