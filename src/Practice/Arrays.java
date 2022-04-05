package Practice;

public class Arrays {

	public static void main(String[] args) {
		/*
		 * int a[]=new int[3];
		 * 
		 * a[0]=1; a[1]=2; a[2]=3;
		 */
		
		/*
		 * for(int i=0;i<=2;i++) { System.out.println(a[i]); }
		 */
		/*
		 * for(int l:a) { System.out.println(l); }
		 */
		
		Object a[][]=new Object[3][2];
		Object b[][]= {{1,2,3},{4,5,6},{12.13,15},{1,2,5}};
		
		a[0][0]=1;
		a[0][1]="Test";
		a[1][0]=10.7;
		a[1][1]='r';
		a[2][0]="test";
		a[2][1]=true;
		
		
		  for(Object l[]:a){
			  for (Object n:l)
		  
		  { 
			  System.out.print(n+" ");
			  }
		 System.out.println();
		  }
       /* for(int i=0;i<=2;i++) {
        	for(int j=0;j<=1;j++) {
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }*/
	}

}
