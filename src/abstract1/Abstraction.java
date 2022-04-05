package abstract1;
abstract class Trial
{
	int a;
	String s;
	
	int display() {
		return a;
	}
	abstract void show() ;
}
public  class Abstraction extends Trial{
	void show() {
	System.out.println(s);
	}
	public static void main(String [] args) {
		Abstraction obj=new Abstraction();
		obj.s="Anand";
		obj.show();
		obj.a=10;
		int newa=obj.display();
		System.out.println(obj.display());
		System.out.println(newa);
		
	}
}