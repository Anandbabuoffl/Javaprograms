package javaprograms;

import java.util.Arrays;

public class Binaryserach {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };  //elements should in sorted order
		boolean flag = false;

		int key = 10;

		int l = 0;
		int h = a.length-1;

		while (l <= h) {

			int mid = (l + h) / 2;
			{
				if (a[mid] == key) {
					System.out.println("Element is found");
					flag=true;
					break;
				}  if (a[mid] < key) {
					l = mid + 1;
				} if (a[mid] > key) {
					h = mid - 1;
				}
			}
				
				}
		if(flag==false) {
			System.out.println("Element not found");

			}
		
		int num=Arrays.binarySearch(a, 4);
		System.out.println(num);
		
		}

	}


