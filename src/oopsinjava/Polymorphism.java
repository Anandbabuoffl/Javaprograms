package oopsinjava;
class Poly
{
String name="Tylor swift";
int noofoscar;
int noofemmy;
public void awds(int oscar) {
	noofoscar=oscar;
	System.out.println(oscar);
}
void awds(int oscar,int emmy )
{
	noofemmy=emmy;
	System.out.println(oscar);
	System.out.println(emmy);
}
}
public class Polymorphism {

	public static void main(String[] args) {
		Poly obj=new  Poly();
		obj.awds(5);
		
		
	}

}
