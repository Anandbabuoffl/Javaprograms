package oopsinjava;
class Encapexample
{
	private int id;
	String name;
	 void setid(int newid)
	{
		id=newid;
	}
	int getid() 
	{
		return id;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Encapexample obj=new Encapexample();
		obj.setid(232);
		int N=obj.getid();
		System.out.println(N);
		
		
	}

}
