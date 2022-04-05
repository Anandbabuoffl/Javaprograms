package Practice;

 class Call{
	private String s;
	public String getname() {
		return s;
	}
	public void setname(String name) {
		s=name;
	}
}


public class Encapsulation {

	public static void main(String[] args) {
		Call a=new Call();
		a.setname("Anand");
		String s1=a.getname();
		System.out.println(s1);
		
	}

}
