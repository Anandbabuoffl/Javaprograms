package Arraylisthashmap;

import java.util.HashMap;

public class Hashmap {
HashMap hm=new HashMap();
void display() 
{
	hm.put(10,"Anand");
	hm.put(12,"Arun");
	hm.put(9,"Anand");
	System.out.println(hm.size());
	System.out.println(hm);
	hm.put(3,13.0);
	hm.put(1,"continue");
	System.out.println(hm);
}

	public static void main(String[] args) {
		
		Hashmap obj=new Hashmap();
		obj.display();
		
	}

}
