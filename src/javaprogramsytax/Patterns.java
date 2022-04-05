package javaprogramsytax;

public class Patterns {

	public void firstp() {
		/*
		 * for (int i=0;i<5;i++)
		 *  { for (int j=0;j<5;j++) 
		 *  { 
		 *  System.out.print(" *"); 
		 *  }
		 * System.out.println(); 
		 * }
		 */
		/*
		 * int i=0; 
		 * while(i<5) 
		 * { 
		 * i++;
		 *  int j=0; 
		 *  while(j<5)
		 *   {
		 *    System.out.print(" *");
		 *     j++;
		 * } 
		 * System.out.println();
		 * 
		 * }
		 */
		int i=0;
		do {
			i++;
		}while(i<5);
		int j=0;
		do{
			System.out.println(" *");
			j++;
		}while(j<5);
	
		}
	public static void main(String[] args) {
		
		Patterns patterns=new Patterns();
		patterns.firstp();
	}

}
