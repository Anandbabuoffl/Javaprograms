package javaprogramsytax;

public class Twodimensionalarray {

	public static void main(String[] args) {
		int a[][]=new int [2][3];
		a[0][0]=10;
		a[0][1]=10;
		a[0][2]=10;
		
		a[1][0]=20;
		a[1][1]=20;
		a[1][2]=20;
		
		System.out.println(a[1][2]);
		
		System.out.println();
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
			
			for(int c[]:a)
			{
				for(int e:c)
				{
					System.out.print(e+"  ");
					
					System.out.println();
				}
			}
		}
		

		
	}

}
