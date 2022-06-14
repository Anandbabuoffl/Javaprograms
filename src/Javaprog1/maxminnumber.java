package Javaprog1;

public class maxminnumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int len=a.length;
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<len;i++) {
			if(max<a[i]);
			max=a[i];	
		}
		System.out.println(max);
		
		for(int i=0;i<len;i++) {
			if(min>a[i]) 
				min=a[i];
		}
		System.out.println(min);
	}

}
