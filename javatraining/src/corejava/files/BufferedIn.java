package corejava.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedIn {
	public static void main(String[] args) throws IOException {
		FileInputStream j21=new FileInputStream("D:\\N\\N.txt");
		BufferedInputStream b=new BufferedInputStream(j21);
		int i=0;
		while((i=b.read())!=-1) {
			System.out.print((char)i);
		}

	}

}
