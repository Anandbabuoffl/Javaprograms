package javaprogramsytax;

public class Conditionstatementinjava {

	public static void main(String[] args) {
	int	password=12134;
	if(password==12134)
	{
		System.out.println("true");
	}
		System.out.println("false");//if condition
		
        System.out.println();
        
        String s="India";
        if(s=="India")
        {
        	System.out.println("provide aadhar card");
        }
        else {
        	System.out.println("Don't provide the card");//if else condition
        
        }
        System.out.println();
        
        int studentmarks=80;
        if(studentmarks>90)
        {
        	System.out.println("Grade is A");
        }
         else if(studentmarks>80)
        {
        	System.out.println("Grade is B");
       
        }
         else if(studentmarks>70)
         {
        	 System.out.println("Grade is c");
         }
         else  {
        	 System.out.println("exit");//nested if else condition
         }
        
        System.out.println();
        
        int day=3;
        
        switch(day)
        {
        case 1: System.out.println("sunday");
        break;
        case 2:System.out.println("monday");
        break;
        case 3:System.out.println("tuesday");
        case 4:System.out.println("wensday");
        case 5:System.out.println("thrusday");
        case 6:System.out.println("friday");
        case 7:System.out.println("staurday");//switch condition
        
        }
        
        		
        
        


	}

}
