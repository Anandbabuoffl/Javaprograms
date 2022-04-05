package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList4 {
	
	LinkedList l1=new LinkedList();
	
	void display()
	{
		l1.add(10);
		l1.add(15);
		l1.add(14);
		l1.add(16);
		l1.add(18);
		System.out.println(l1);
		l1.addFirst(12);
		l1.addLast(16);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println(l1);
		
	}
	
	public static void main(String[] args) {
		LinkedList4 obj=new LinkedList4();
		obj.display();
	}

}
