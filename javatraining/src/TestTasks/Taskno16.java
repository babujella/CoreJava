package TestTasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Taskno16 {
	public static void main(String[] args) throws IOException {
		FileReader filereader=new FileReader("D:\\TASKS\\TASKS.txt");
		PrintWriter printwriter=new PrintWriter("D:\\Taskno16\\Taskno16.xls");
		Scanner sc=new Scanner(filereader);
		while(sc.hasNext()) {
			printwriter.println(sc.next());
		}
		printwriter.close();
		System.out.println("Success");
	}
}
