package collections;

import java.util.HashSet;

public class HashSet2 {

	HashSet h=new HashSet();
	void display()
	{
		h.add(10.2);
		h.add("Anand");
		h.add(10.4);
		h.add(10.9);
		h.add(10.1);
		System.out.println(h);
	}
	HashSet h1=new HashSet();
	void show()
	{
		h1.add(1);
		h1.addAll(h);
		System.out.println(h1);
		h1.removeAll(h);
		System.out.println(h1);
	}
	public static void main(String[] args) {
		HashSet2 obj=new HashSet2();
		obj.display();
		obj.show();
		

	}

}
