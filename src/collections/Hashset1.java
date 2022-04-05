package collections;

import java.util.HashSet;

public class Hashset1 {
	HashSet h=new HashSet();
	void display()
	{
		h.add("welcome");
		h.add(4);
		h.add(12);
		h.add("1");
		h.add("3");
	
		System.out.println(h);
		h.remove(4);
		System.out.println(h);
		System.out.println(h.contains(4));
		System.out.println(h.isEmpty());
		System.out.println(h.contains("welc"));
		
		
	}

	public static void main(String[] args) {
		Hashset1 obj=new Hashset1();
		obj.display();
	}

}
