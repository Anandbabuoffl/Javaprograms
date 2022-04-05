package oopsinjava;

public class Statickeyword {
int stuid;
String name;
static int stuclass=10;

static void details()
{
	System.out.println("fun");
}
void detail()
{
	System.out.println(stuid +" "+name);
}
	public static void main(String[] args) {
		stuclass=10;
		System.out.println(stuclass);
		Statickeyword.details();
		Statickeyword obj=new Statickeyword();
		obj.stuid=283;
		obj.name="Anand";
		obj.detail();
		Statickeyword obj1=new Statickeyword();
		obj.details();
		obj.stuclass=12;
		System.out.println(stuclass);

	}

}
