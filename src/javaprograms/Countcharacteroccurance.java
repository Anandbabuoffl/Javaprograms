package javaprograms;

public class Countcharacteroccurance {

	public static void main(String[] args) {
		String s = "Java programming ";

		
		  int totalcount = s.length(); 
			/*
			 * System.out.println(totalcount);
			 * 
			 * 
			 * String n = s.replace("a", "");
			 * 
			 * int afterremovecharcount = n.length();
			 * 
			 * int counts = totalcount - afterremovecharcount;
			 * System.out.println("Number of a occurance " + count);
			 */
		 
		    int count=0;
		 
          for(int i=0;i<totalcount-1;i++) {
        	  if(s.charAt(i)=='a') {
        		  count++;
        	  }
        	  
          }
          System.out.println("Number of a occurance " + count);
			 
		
				
			}
		}
	


