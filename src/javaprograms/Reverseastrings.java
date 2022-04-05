package javaprograms;

public class Reverseastrings {

	public static void main(String[] args) {
		
		//using string concatenation operator 
		
		String st="Anand";
		String rev="";
		
		int len=st.length();
		
		/*
		 * for(int i=len-1;i>=0;i--) { rev=rev+st.charAt(i); }
		 * System.out.println("Reverse string is "+rev);
		 */

		//using stringbuffer
		
		StringBuffer sb=new StringBuffer(st);
		StringBuffer reverse=sb.reverse();
		System.out.println("Reverse string is "+reverse);
		
		
	}

}
