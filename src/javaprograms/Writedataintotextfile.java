package javaprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writedataintotextfile {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\bbuanan\\Documents\\test.txt");
		BufferedWriter b=new BufferedWriter(fw);
		b.write("java");
		b.write("java");
		b.write("java");
		System.out.println("finished");
		b.close();
	}
	

}
