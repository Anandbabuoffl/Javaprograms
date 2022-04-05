package abstract1;

abstract class A2 {
int id1;
int id2;
abstract void display();
	
int show() {
	return id2;
}
}
class Abstraction2 extends A2{
	 void display() {
		 System.out.println(id1);
	 }
	public static void main(String[] args) {
		Abstraction2 obj=new Abstraction2();
		obj.id1=10;
		obj.display();
	}

}
