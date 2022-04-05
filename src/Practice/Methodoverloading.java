package Practice;

public class Methodoverloading {
	int a, b=20;
	String s="Anand", st="babu";
	float c;

	void details() {
            c=a+b;
	}
	void details(int n1,int n2) {
		a=n1;
		b=n2;
	}
	
	void details(int n1,String s1) {
		a=n1;
		s=s1;
	}
	Methodoverloading(){
		 if(a<b) {
			 System.out.println("A is gerater");
		 }
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		
	}
	
	public static void main() {
		 int r=26;
		 System.out.println(r);
	}

	public static void main(String[] args) {
		
		
		Methodoverloading m=new Methodoverloading();
		m.display();
		m.main();
		/*
		 * m.details(10,10); m.display();
		 */
	}


	}
