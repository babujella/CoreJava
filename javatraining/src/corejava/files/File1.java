package corejava.files;

import java.io.File;
import java.io.IOException;

public class File1{
	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
		System.out.println(f.exists());
		try {
		f.createNewFile();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(f.exists());

		System.out.println("Success");

	}

}
