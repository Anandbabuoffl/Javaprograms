package javaprograms;

import java.util.Arrays;
import java.util.Collections;

public class Elementsort {

	public static void main(String[] args) {
		int a[]= {10,40,60,70,51};
		
		System.out.println("Before element sort"+Arrays.toString(a));
		
		/*
		 * Arrays.parallelSort(a);
		 * System.out.println("After element sort"+Arrays.toString(a));
		 */
		
		/*
		 * Arrays.sort(a); System.out.println("After element sort"+Arrays.toString(a));
		 */
		
		//sort element in reverse order
		
		Integer arr[]= {6,8,4,9,28,36};
		System.out.println("Before element sort"+Arrays.toString(arr));
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("After element sort"+Arrays.toString(arr));
		
	}

}
