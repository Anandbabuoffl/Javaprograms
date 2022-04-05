package javaprogramsytax;

public class Multipledatatypearray {

	public static void main(String[] args) 
	{
		Object ar[]=new Object[5];//store mutiple datatype in any array using the object word
		
		ar[0]=10;
		ar[1]="Welcome";
		ar[2]=30.25;
		ar[3]='c';
		ar[4]=true;
		
		for(Object i:ar)
		{
			System.out.println(i);
		}

	}

}
