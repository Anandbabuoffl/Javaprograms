package Exceptionhandling;

public class Checkede2 {
	String a1="Anand";
	int a=2;
	
	void show() throws InterruptedException
	{
		System.out.println(a1);
		Thread.sleep(2000);
		System.out.println(a);
	}

	public static void main(String[] args) throws InterruptedException {
		Checkede2 obj=new Checkede2();
		obj.show();

	}

}
