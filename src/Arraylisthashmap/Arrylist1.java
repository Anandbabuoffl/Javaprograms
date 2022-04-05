package Arraylisthashmap;

import java.util.ArrayList;

public class Arrylist1 
{
  ArrayList<String> al=new ArrayList<String>();
  void display()
  {
	  al.add("ANAND");
	  al.add("ARUN");
	  al.add("ARAVIND");
	  al.add("AKASH");
	  System.out.println(al.size());
	System.out.println(al);
	
	  for(String p:al) 
	  {
		  System.out.println(p);
	  }
	  
  }
 
	public static void main(String[] args) {
		Arrylist1 obj=new Arrylist1();
		obj.display();
		
	}

}
