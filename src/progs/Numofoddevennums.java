package progs;

public class Numofoddevennums {
	
	int num=1234;
	int rev=0;
	int countodd,counteven;
	
	void oddeven()
	{
		while(num>0) {
		rev=num%10;
		if(rev%2==0)
		{
			counteven++;
		}
		else
		{
			countodd++;
		}
		num=num/10;
		}
	System.out.println(countodd);
	System.out.println(counteven);
	}
	public static void main(String[] args) {
		Numofoddevennums oddeve=new Numofoddevennums();
		oddeve.oddeven();
	}

}
