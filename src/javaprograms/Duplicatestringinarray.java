package javaprograms;

import java.util.HashSet;

public class Duplicatestringinarray {

	public static void main(String[] args) {
		String ar[] = { "java", "maven", "testng", "java" };

		/*boolean flag=false;
		
		 * for (int i = 0; i < ar.length; i++) { for (int j = i + 1; j < ar.length; j++)
		 * { if (ar[i] == ar[j]) { System.out.println("Duplicate value is " + ar[j]);
		 * flag=true; } }
		 * 
		 * } if(flag==false) { System.out.println("Duplicate value is not found"); }
		 */
		
		String a[] = { "java", "maven", "testng", "java" };
		HashSet <String> hs=new HashSet<String>();
		boolean flag=false;
		
		
		for(String l:a)
				{
			if(hs.add(l)==false);
			{
				System.out.println("Duplicate is found "+l);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Duplicate not found");
			
		}
		

	}

}
