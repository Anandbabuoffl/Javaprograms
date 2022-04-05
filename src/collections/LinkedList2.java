package collections;

import java.util.LinkedList;

public class LinkedList2 {
LinkedList l=new LinkedList();
void display()
{
l.add(10);
l.add("Anand");
l.add(10.7);
l.add('h');
l.add(true);
System.out.println(l);
l.remove(1);
System.out.println(l);
System.out.println(l.contains(10));
System.out.println(l.isEmpty());
System.out.println(l.get(1));
l.set(0, 12);
System.out.println(l);
System.out.println(l.size());

for(Object s:l)
{
	System.out.println(s);
}


}
	public static void main(String[] args) {
		LinkedList2 l=new LinkedList2();
		l.display();

	}

}
