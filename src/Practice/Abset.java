package Practice;

 abstract class Abset1{
	 int a=10;
	abstract void display();
	 void show() {
		 int a=20;
		 System.out.println("anand");
		 System.out.println(a);
	 }
}

public  class Abset extends Abset1{
	 void display() {
		 System.out.println("test");
	 }
	 public static void main(String[] args) {
		 Abset1 a=new Abset();
		 a.display();
		 a.show();
	}
}