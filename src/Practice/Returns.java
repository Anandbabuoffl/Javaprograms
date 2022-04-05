package Practice;

public class Returns {
	int a=10,b=20;
	
    int	sum(){
		return a+b;
	}
	public static void main(String[] args) {
	  
		Returns r=new Returns();
		int s=r.sum();
	   System.out.println(s);
	}

}
