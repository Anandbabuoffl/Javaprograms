package javaprograms;

import java.util.Arrays;

public class Bubblesorting {

	public static void main(String[] args) {
		int a[]= {2,6,8,1,4,60};

		System.out.println("Before sort "+Arrays.toString(a));
		
		int num=a.length;
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-1;j++) {
				if(a[j]>a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
System.out.println("After sort "+Arrays.toString(a));
		
	}

}
