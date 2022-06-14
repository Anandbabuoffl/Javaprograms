package progs;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Randomnums {
	
	static void rannum() {
		Random arn=new Random();
		int na=arn.nextInt(10);
		System.out.println(na);
		
		String w=RandomStringUtils.randomNumeric(10);
		String y=RandomStringUtils.randomAlphabetic(10);
		System.out.println(w);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
rannum();
	}

}
