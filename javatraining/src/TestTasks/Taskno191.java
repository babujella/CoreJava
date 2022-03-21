package TestTasks;

import java.util.Scanner;

/*Implement an exception "InvalidUserName".
User inputs his UserName in console. When length of userName is <10 or if it has "&", this should be handled by the exception.*/
public class Taskno191 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the name");
			String name = sc.next();
			if (name.length() < 10 || (name.contains("&"))) {
				throw new Exception("your name is out of our specification...SORRY");
			}
			else {

				System.out.println("Your name is :" + name);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
