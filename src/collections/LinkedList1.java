package collections;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
        l.add("Ananad");
        l.add(10);
        l.add('d');
        l.add(19.3);
        l.add(null);
        
        System.out.println(l);
        System.out.println(l.size());
        l.remove(1);
        System.out.println(l);
        l.add(1,18);
        System.out.println(l);
        

	}

}
