package oopsinjava;

public class Constructoroverloading {
  int odi;
  String name;
  int run;
  Constructoroverloading(int match,String n,int r)
  {
	  odi=match;
	  name=n;
	  run=r;
	
  }
  Constructoroverloading(int match,String n)
  {
	  odi=match;
	  name=n;
  }
  void display()
  {
	  System.out.println(odi);
	  System.out.println(name);
	  System.out.println(run);
  }
  
	public static void main(String[] args) {
		Constructoroverloading obj=new Constructoroverloading(235,"virat",2534);
obj.display();//constructor overloading
	}

}
