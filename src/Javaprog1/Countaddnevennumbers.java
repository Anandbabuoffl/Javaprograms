package Javaprog1;

public class Countaddnevennumbers {

	public static void main(String[] args) {
		int num= 234323;
		int countodd=0;
		int counteven=0;
		
		while(num>0) {
			int red=num%10;
			if(red%2==0) {
				counteven++;
			}
			else {
				countodd++;
			}
			num=num/10;
			
		}
		System.out.println(counteven);
		System.out.println(countodd);
		}
}