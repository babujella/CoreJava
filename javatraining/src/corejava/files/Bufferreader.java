package corejava.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferreader {
	public static void main(String[] args) throws IOException {
    	FileReader fw=new FileReader("D:\\testout.txt");    
    	BufferedReader b=new BufferedReader(fw);
    	int i;
    	while((i=b.read())!=-1)
    		System.out.print((char)i);

	}

}
