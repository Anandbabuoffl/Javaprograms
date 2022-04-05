package collections;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
LinkedHashSet l=new LinkedHashSet();

void display() {
	l.add(1);
	l.add(2);
	l.add(37);
	l.add("Anand");
	l.add(545);
	System.out.println(l);
	
	
}
	public static void main(String[] args) {
		LinkedHashSet1 obj=new LinkedHashSet1();
		obj.display();
		
	}

}
