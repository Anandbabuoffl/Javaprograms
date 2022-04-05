package maps;

import java.io.ObjectInput;
import java.util.HashMap;

public class Hashmap2 {
HashMap hm=new HashMap();
void display()
{
	hm.put(1,"welcome");
	hm.put(2, 10);
	hm.put(3, 12.6);
	hm.put(4, 'e');
	hm.put(5, "Hello");
	hm.put(7, "welcome");
	System.out.println(hm);
	System.out.println(hm.containsValue(10));
	System.out.println(hm.containsKey(7));
	System.out.println(hm.keySet());
	for (Object i:hm.keySet())
	{
		System.out.println(i);
	}
	System.out.println(hm.values());
	
	System.out.println(hm.entrySet());
	for(Object i:hm.entrySet())
	{
		System.out.println(i);
	}
	
}
	public static void main(String[] args) {
		
		Hashmap2 obj=new Hashmap2();
		obj.display();
	}

}
