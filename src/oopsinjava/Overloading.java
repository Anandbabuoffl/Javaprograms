package oopsinjava;

public class Overloading {
int no;
String name;
int dept;

void s1()
{
	System.out.println(no);
	System.out.println(name);
	System.out.println(dept);
}

void s1(int n,String s,int de)
{
	no=n;
	name=s;
	dept=de;
	
}
void s1(String s,int de)
{
	name=s;
	dept=de;
}
	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.no=1234;
		obj.name="Sachin";
		obj.dept=176636;
		obj.s1();
		obj.s1(263,"anand",2364);
		obj.s1("jai",2635);//method overloading
		
		
		
		
		obj.s1();
	
	}

}
