package Practice;


	
	class Bank{
		int a,b;
		void display() {
			System.out.println(a+b);
		}
	}
	class axis extends Bank{
		String s;
		
	void display() {
		System.out.println(s);
		
	}
	}
	class sbi extends Bank
	{
		int x;
		void get() {
			System.out.println(x);
		}
	}
	public class Inheritance {	
	public static void main(String[] args) {
	
		axis a=new axis();
		a.s="test";
		a.a=10;
		a.b=10;
		a.display();
	}

}
