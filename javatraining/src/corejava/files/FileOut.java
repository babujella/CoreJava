package corejava.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {

	public static void main(String[] args) throws IOException {
		
			FileOutputStream j=new FileOutputStream("D:\\Tech\\Tech.txt");
			j.write(56);
			System.out.println("success");
			
			FileOutputStream j1=new FileOutputStream("D:\\Tech\\Tech.txt");
			String s="Hii Babu";
			byte[] b=s.getBytes();
			j1.write(b);
			System.out.println("Success");
			
			FileInputStream j11=new FileInputStream("D:\\Tech\\Tech.txt");
			int i=j11.read();
			System.out.println((char)i);
			
			



	}

}
