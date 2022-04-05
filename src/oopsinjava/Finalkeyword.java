package oopsinjava;

 class Final//final in class
 {
 final int a=10;//final in varibale
int b=12;

 void sum()//final in method

{
	System.out.println(a+b);
}
 }
class Next extends Finalkeyword
{
	int a=12;
	int b=13;
	void sum()
	{
		System.out.println(a-b);
	}
}
public class Finalkeyword
{
	public static void main(String[] args) {
		
		Final obj=new Final();
		obj.sum();
		Next obj1=new Next();
		obj1.sum();
		
	}
	}


