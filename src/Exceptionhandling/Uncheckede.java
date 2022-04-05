package Exceptionhandling;

public class Uncheckede {   //exception which are not identify by the java complier
int a=10;                   //Arithmetic exception,Arrayoutofbound exception,nullpointer exception
void div()
{
	try {
		System.out.println(a/0);
	}
	catch(Exception e)
	{
		System.out.println(e.getLocalizedMessage());
		System.out.println("complete");
	}
	
	finally {
		System.out.println("move");
	}
}
	public static void main(String[] args) {
		Uncheckede obj=new Uncheckede();
		obj.div();

	}

}
