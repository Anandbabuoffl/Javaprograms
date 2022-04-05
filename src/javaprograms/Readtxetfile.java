package javaprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readtxetfile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\bbuanan\\Documents\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		br.close();

		File f = new File("C:\\Users\\bbuanan\\Documents\\test.txt");
		Scanner scanner = new Scanner(f);
		/*
		 * while(scanner.hasNextLine()) { System.out.println(scanner.nextLine()); }
		 */
		scanner.useDelimiter("\\z");
		System.out.println(scanner.next());
	}

}
