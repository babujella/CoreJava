package corejava.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter {

	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("abc.txt");
		PrintWriter p=new PrintWriter(f);
		p.println(4);
		p.println("Babu");
		p.println('A');
		p.println(4.3f);
		p.close();
		System.out.println("Sucess");
		
	}

}
