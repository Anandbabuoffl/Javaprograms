package maps;

import java.util.Hashtable;

public class HashTable1 {
Hashtable t=new Hashtable();
void display()
{
t.put(1,"Anand");
t.put(2, "Arun");
t.put(3, "karthi");
System.out.println(t);
t.remove(2);
System.out.println(t);
System.out.println(t.get(3));
System.out.println(t.containsKey(1));
System.out.println(t.containsValue("Anand"));
System.out.println(t.size());
System.out.println(t.keySet());
System.out.println(t.values());
System.out.println(t.entrySet());
for(Object i:t.entrySet())
{
	System.out.println(i);
}


}

	public static void main(String[] args) {
		HashTable1 obj=new HashTable1();
		obj.display();

	}

}
