package javaprograms;

public class Serachelementinarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,40};
		int search=40;
		 boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==search) {
				System.out.println("Element found "+a[i]);
				flag=true;
			}
			}
		if(flag==false) {
			System.out.println("Element not available");
		}
	

	}

}
