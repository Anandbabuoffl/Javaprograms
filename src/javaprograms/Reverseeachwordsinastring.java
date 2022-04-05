package javaprograms;

public class Reverseeachwordsinastring {

	public static void main(String[] args) {
		String s = "Welcome to Home";

		String[] words = s.split(" ");

		String reversestring = "";

		/*
		 * for(String a:words) { String reverseword=""; for(int i=a.length()-1;i>=0;i--)
		 * { reverseword=reverseword+a.charAt(i); }
		 * reversestring=reversestring+reverseword+" "; }
		 * System.out.println("After reverse the words in string "+reversestring);
		 */

		for (String a : words) {
			
			StringBuilder sb = new StringBuilder(a);
			sb.reverse();
			reversestring=reversestring+sb.toString()+" ";
		}
		 System.out.println("After reverse the words in string "+reversestring);

	}

}
