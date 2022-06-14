package progs;

public class Pat1 {
	
	void patt(int n) {
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--) {
				System.out.print(" *");
			}
		System.out.println( );
		}
	}

	public static void main(String[] args) {
		Pat1 pat1=new Pat1();
		pat1.patt(4);

	}

}
