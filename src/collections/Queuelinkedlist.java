package collections;

import java.util.LinkedList;

public class Queuelinkedlist {
LinkedList l=new LinkedList();

void display()
{
	l.add(1);
	l.add(10.2);
	l.add("Anand");
	l.add('q');
	l.offer("welcome");
	System.out.println(l);
	System.out.println(l.element());
	System.out.println(l.poll());
	System.out.println(l.remove());
	System.out.println(l);
	
	
}
	public static void main(String[] args) {
		Queuelinkedlist obj=new Queuelinkedlist();
		obj.display();
	}

}
