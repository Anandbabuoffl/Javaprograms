package collections;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();//declaration
		al.add("Anand");//adding elements in arraylist
		al.add(10);
		al.add(20.5);
		al.add('c');
		al.add(true);
		System.out.println(al);
		System.out.println(al.size());
		al.remove(2);
		System.out.println(al);
		al.add(1,12);
		System.out.println(al);
		al.get(1);
		System.out.println(al.get(1));
		al.set(3,"emmy" );
		System.out.println(al);
		al.contains(10);
		System.out.println(al.contains(10));
		al.isEmpty();
		System.out.println(al.isEmpty());
		ArrayList al1=new ArrayList();
		al1.addAll(al);
		System.out.println(al1);
		al1.add(true);
		//al1.removeAll(al1);
		System.out.println("array " +al1);
		System.out.println(al);
		al.add(12);
		System.out.println(al);
		
		
		
		
	}

}
