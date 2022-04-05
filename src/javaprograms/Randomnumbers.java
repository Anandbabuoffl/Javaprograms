package javaprograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Randomnumbers {

	public static void main(String[] args) {
		Random r=new Random();
		int n=r.nextInt(100);
        System.out.println(n);
        
       String num= RandomStringUtils.randomNumeric(10);
       System.out.println(num);
       
       String words= RandomStringUtils.randomAlphabetic(10);
       System.out.println(words);
	}

}
