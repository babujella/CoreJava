package corejava.files;  
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;  
public class Filewriter {  
    public static void main(String args[]) throws IOException{    
    	FileWriter fw=new FileWriter("D:\\testout.txt");    
           fw.write("Hello java  ");   
           fw.write("Babu");
           fw.close();    
          System.out.println("Success...");  
    }    
    
}  