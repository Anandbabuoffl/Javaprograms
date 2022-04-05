package javaprograms;

public class Removejunkchars {

	public static void main(String[] args) {
		String s="1265612%*^%*&^ 8933 java";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		

	}

}
