package maps;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, 12);
		hm.put(2, 13);
		hm.put(3,"Anand");
		hm.put(4, null);
		hm.put(5, null);
		hm.put(null, null);
		hm.put(null, null);
		hm.remove(3);
		System.out.println(hm.get(1));
		System.out.println(hm);
		System.out.println(hm.containsKey(5));
        System.out.println(hm.isEmpty());
     
	}

}
