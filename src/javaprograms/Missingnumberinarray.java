package javaprograms;

public class Missingnumberinarray {

	public static void main(String[] args) {
		int a[]= {2,4,5,6,7};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int i=2;i<=7;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		System.out.println("Missing number is "+(sum1-sum));

	}

}
