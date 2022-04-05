package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist3 {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4};
		for(int i:ar) {
			System.out.println(i);
		}
		ArrayList al=new ArrayList(Arrays.asList(ar));
		System.out.println(al);

	}

}
