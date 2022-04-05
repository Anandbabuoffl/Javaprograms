package Practice;

public class Oops {

	String p1,p2,p3;
	int nom1,nom2,nom3;
	int pa1,pa2,pa3;
	char grade;
	
   void playersname(String n1,String n2,String n3) {
	   p1=n1;
	   p2=n2;
	   p3=n3;
	   System.out.println("Name is "+p1);
	   System.out.println("Name is "+p2);
	   System.out.println("Name is "+p3);
   }
   
   void noofmatches() {
	   System.out.println(nom1);
	   System.out.println(nom2);
	   System.out.println(nom3);
	   
   }
   Oops(int avg1,int avg2,int avg3)
   {
	   pa1=avg1;
	   pa2=avg2;
	   pa3=avg3;
   }
   
   void result() {
	   if(pa1>90) {
		   System.out.println("Grade is A");
		   
	   }
	   if(pa2>80) {
		   System.out.println("Grade is B");
		   
	   }
	   if(pa3>70) {
		   System.out.println("Grade is B");
		   
	   }
	   else {
		   System.out.println("not found");
	   }
   }

   
	
	public static void main(String[] args) {
		Oops p = new Oops(100,12,15);
		p.playersname("virat", "sachein", "rohit");
		p.nom1=10;
		p.nom2=20;
		p.nom3=30;
		p.noofmatches();
		p.result();

	}

}
