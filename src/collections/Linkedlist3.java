package collections;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist3 {
	LinkedList l1=new LinkedList();
	void display()
	{
		l1.add(10);
		l1.add("Anand");
		l1.add(10.7);
		l1.add('h');
		l1.add(true);
		System.out.println(l1);
	}
	LinkedList l2=new LinkedList();
	void show()
	{
		l2.add("Arun");
		l2.addAll(l1);
		l2.removeAll(l1);
		System.out.println(l2);
	}
	
	
	public static void main(String[] args)
	{
		Linkedlist3 obj=new Linkedlist3();
		obj.display();
		obj.show();
		
		
	}

}
