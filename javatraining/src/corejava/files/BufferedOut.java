package corejava.files;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOut {
	public static void main(String[] args) throws IOException {
		FileOutputStream j21=new FileOutputStream("D:\\N\\N.txt");
		BufferedOutputStream b=new BufferedOutputStream(j21);
		String s="Hello Babu";
		byte[] a=s.getBytes();
		b.write(a);
		b.flush();
		System.out.println("Succesed");
	}
}
