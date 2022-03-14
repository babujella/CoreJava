package corejava.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBuffered {
	public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\testin.txt");  
       BufferedWriter b = new BufferedWriter(fw); 
			b.write("Hello Techouts");
		
        System.out.println("Success");
        


	}

}
