package javaprograms;

public class Checkarrysequal {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};

		/*boolean n=Arrays.equals(a1, a2);
		System.out.println(n);
		*/
		
		
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]==a2[i]);
				
			}
			System.out.println("arrys is eaqual");
		}
			else 
			{
				System.out.println("arrys is not eaqual");
			}
			
		
		}
	}


