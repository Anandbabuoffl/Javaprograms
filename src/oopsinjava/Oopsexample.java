package oopsinjava;

public class Oopsexample {
	int id;
	String name;
	int salary;
	int dept;
	
	/*Oopsexample(int ids,String s,int sal,int depr)
	{
		id=ids;
		name=s;
		salary=sal;
		dept=depr;
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(dept);

	}*/
	
	void sdata(int ids,String s,int sal,int depr)
	{
		id=ids;
		name=s;
		salary=sal;
		dept=depr;
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(dept);
	}
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(dept);
	}

	public static void main(String[] args) {
		
/*Oopsexample obj=new Oopsexample();
obj.id=2323;
obj.name="Anand";
obj.salary=50000;
obj.dept=2;
obj.display();*/   //assigning values to class variables using object
		

//Oopsexample obj1=new Oopsexample(234,"virat",23,176);
//obj1.display();  //assigning values to class variables using constructor
Oopsexample obj2=new Oopsexample();
obj2.sdata(232,"virat",23,176);
obj2.display();      //assigning values to class variables using method






	}

}
