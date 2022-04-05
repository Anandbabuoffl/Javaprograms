package javaprograms;

public class Sumofelementsinarray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		int sum=0;
		
		/*
		 * for(int i=0;i<=a.length-1;i++) { sum=sum+a[i]; }
		 */
		
		//enhanced loop
		
		for(int value:a) {
			sum=sum+value;
		}
		System.out.println("Sumofelementsinarray is "+sum);

	}

}
