package TestTasks;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Checks checks=new Checks();
		System.out.println("Enter date to check :");
		String date=sc.next();
		checks.earlierOrNot(date);
		checks.AfterOrNot(date);
		checks.converter(date);
	}
}

