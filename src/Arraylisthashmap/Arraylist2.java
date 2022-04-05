package Arraylisthashmap;

import java.util.ArrayList;

public class Arraylist2 
{
    ArrayList al=new ArrayList();
     
    void display() {
    	al.add(10);
    	al.add("Anand");
    	al.add(13.0);
    	System.out.println(al.size());
    	al.add(1,11);
    	al.remove(2);
    	al.remove("Anand");
    	System.out.println(al);
    	
    }
     
	public static void main(String[] args) {
		Arraylist2 obj=new Arraylist2();
		obj.display();
		
		

	}

}
