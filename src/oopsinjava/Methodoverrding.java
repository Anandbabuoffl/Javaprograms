package oopsinjava;
import java.util.Scanner;
 class Movie {
	 String nameofmovies;
	 int noofsongs;
	
void display()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the movie name");
String nameofmovie=sc.nextLine();
System.out.println("Enter the noofsong");
int noofsongs=sc.nextInt();
System.out.println(nameofmovie);
System.out.println(noofsongs);
}
}
class moviedetail extends Movie
{
String actor;
int fights;
	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the actor name");
		String actor=sc.nextLine();
		System.out.println("Enter the nooffights");
		int fights=sc.nextInt();
		System.out.println(actor);
		System.out.println(fights);
		
		
	}
}
	public class Methodoverrding
	{
	public static void main(String[] args)
	{
	
		moviedetail obj=new moviedetail();
		obj.display();

	}

	}

