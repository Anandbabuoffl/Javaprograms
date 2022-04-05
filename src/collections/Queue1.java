package collections;

import java.util.PriorityQueue;

public class Queue1 {
PriorityQueue p=new PriorityQueue();
void display()
{
	p.add(1);
	p.offer(2);
	p.add(4);
	p.offer(2);
	p.add(3);
	p.offer(4);
	System.out.println(p);
	System.out.println(p.element());
	System.out.println(p);
	System.out.println(p.peek());
	System.out.println(p.remove());
	System.out.println(p);
	System.out.println(p.poll());
	System.out.println(p);
	
	
}
	public static void main(String[] args) {
		
		Queue1 obj=new Queue1();
		obj.display();
	}

}
