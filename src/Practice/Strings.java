package Practice;

public class Strings {

	public static void main(String[] args) {
		String s = "Test";

		System.out.println(s.length());
		System.out.println(s.concat("test"));
		System.out.println(s.equals("test"));
		System.out.println(s.equalsIgnoreCase("test"));
		System.out.println(s.contains("n"));
		System.out.println(s.replaceAll("s", "n"));
		System.out.println(s.substring(0, 4));

	}

}
