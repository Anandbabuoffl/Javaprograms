package Javaprog1;

public class Reverseastring {

	public static void main(String[] args) {
		String s="Anand";
		String rev="";
		int count=0;
		
		/*
		 * int len=s.length();
		 * 
		 * for(int i=len-1;i>=0;i--) { rev=rev+s.charAt(i); } System.out.println(rev);
		 */
		int len=s.length();
		
		for(int i=0;i<len;i++)
		{
			rev=rev+s.charAt(i);
			
			System.out.println(rev);
			}
			
		}
	}


