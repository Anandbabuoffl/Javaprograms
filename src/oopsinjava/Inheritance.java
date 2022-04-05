package oopsinjava;

import java.util.Scanner;

class Cricket
{
	int odi;
	int t20;
	int test;
	
	void run(int oneday,int halfday,int fiveday)
	{
		odi=oneday;
		t20=halfday;
		test=fiveday;
		System.out.println("Number of odi matches "+oneday);
		System.out.println("Number of t20 matches "+halfday);
		System.out.println("Number of test matches "+fiveday);
	}
}
class Matches extends Cricket
{
	int odibwIA=5;
	int t20bwIA=3;
	int testbwIA=2;
	void indvsaus()
	{
		odibwIA=3;
		t20bwIA=2;
		testbwIA=2;
		System.out.println("Matches win by INDIA in odi "+odibwIA);
		System.out.println("Matches win by INDIA in t20 "+t20bwIA);
		System.out.println("Matches win by INDIA in test "+testbwIA);
	}
}
class Score extends Matches
{
	void viratruns()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Runs scored by virat in odi");
    int onedayr=sc.nextInt();
    System.out.println("Runs scored by virat in odi");
    int t20r=sc.nextInt();
    System.out.println("Runs scored by virat in odi");
    int testr=sc.nextInt();
    System.out.println(onedayr);
    System.out.println(t20r);
    System.out.println(testr);
    
    
}
}
public class Inheritance {

	public static void main(String[] args) {
		Score obj=new Score();
		obj.run(12,14,10);
		obj.indvsaus();
		obj.viratruns();
		 
	
		

	}

}
