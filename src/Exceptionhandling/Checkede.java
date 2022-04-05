package Exceptionhandling;

public class Checkede {
int a=10;
int b=20;
void display()
{
	System.out.println(a);
	try
	{
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println(b);
	}
	
}
	public static void main(String[] args) {
		Checkede obj=new Checkede();
		obj.display();

	}

}
