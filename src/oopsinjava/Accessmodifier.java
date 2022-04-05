package oopsinjava;

public class Accessmodifier {
public int a=1;
public int b=4;

void sum() {
	System.out.println(a+b);
}
}
class Am extends Accessmodifier
{
	void sub() {
		System.out.println(a-b);
}

	public static void main(String[] args) {
		Accessmodifier obj=new Accessmodifier();
		obj.sum();
		Am obj1=new Am();
		obj1.sub();
		

	}
}

