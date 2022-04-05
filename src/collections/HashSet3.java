package collections;

import java.util.HashSet;

public class HashSet3 {
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
		h1.add(10.2);
		h1.add("Anand");
		h1.add(11);
		h1.add(12);
		h1.add(13);
		System.out.println(h1);
	h1.addAll(h);
	System.out.println(h1);
	h.retainAll(h1);
	System.out.println(h1);
	h1.clear();
	System.out.println(h1);
	h.removeAll(h1);
	System.out.println(h1);
		
	}
		public static void main(String[] args) {
			HashSet3 obj=new HashSet3();
			obj.show();

	}

}
