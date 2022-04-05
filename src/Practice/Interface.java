package Practice;

interface Test{
	int a=10,b=20;
	void display();
}
interface Test1 
{
	 void show() ;
}
class Test2 implements Test1,Test{
	public void display() {
		System.out.println(a);
	}
	public void show() {
		System.out.println("finish");
	}
}

public class Interface {

	public static void main(String[] args) {
		
		Test2 t=new Test2();
		t.show();
		t.display();
		
	}

}
