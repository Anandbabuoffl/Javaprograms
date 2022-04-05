package javaprograms;

public class Removespaceinstring {

	public static void main(String[] args) {
		String s="java   programming    language    done";
		
		System.out.println("Before remove the space "+s);
		
		s=s.replaceAll("\\s", "");
		System.out.println("After remove the space "+s);
	}

}
