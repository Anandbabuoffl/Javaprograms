package progs;

public class Primenum {
	
	int count=0;
	
	void prime(int num) 
	{
		for(int i=1;i<=num;i++) 
			if(num%2==0) 
				count++;
			if(count==2) {
				System.out.println(num+" is prime num");
			}
				else {
					System.out.println(num+" is not prime num");
				}
					
			}
		
	

	public static void main(String[] args) {
		Primenum prime=new Primenum();
		prime.prime(5);
	}

}
