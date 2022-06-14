package Javaprog1;

public class Patterns {
	
void pattern1(int n) {
	for(int row=1;row<=n;row++) {
		for(int col=1;col<=row;col++) {
			System.out.print(row+" ");
		}
		System.out.println( );
	}
}
	public static void main(String[] args) {
		Patterns pn=new Patterns();
		pn.pattern1(4);

	}

}
