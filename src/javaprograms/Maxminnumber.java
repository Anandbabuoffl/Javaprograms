package javaprograms;

public class Maxminnumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
             System.out.println("max number is "+max);
             System.out.println("min number is "+min);
	}

}
