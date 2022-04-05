package Practice;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Anand");
		al.add("test");
		al.add(1, "test1");
		System.out.println(al.contains("Anand"));
		//al.clear();
		al.remove(1);
		System.out.println(al.size());
		System.out.println(al.clone());
		/*
		 * ArrayList<String> als=new ArrayList<String>();
		 * System.out.println(als.addAll(0, al));
		 */
		System.out.println(al);
		for(String l:al) {
			System.out.println(l);
		}

	}

}
