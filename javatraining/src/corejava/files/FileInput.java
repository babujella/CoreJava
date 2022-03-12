package corejava.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
	public static void main(String[] args) throws IOException {
		FileInputStream j21=new FileInputStream("D:\\Tech\\Tech.txt");
		int k=0;
		while((k=j21.read())!=-1){
			System.out.print((char)k);
		}
	}

}
