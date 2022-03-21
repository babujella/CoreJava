package TestTasks;

import java.util.Scanner;

/*21. Class named Operations have final variables like plus,minus,divide and multiply.
This class has a method named calculate which takes 2 inputs of type double and return value in double
inside calculate: if plus, inputs are added and returned.(similarly for other methods minus,divide and multiply).
AssertionError is also thrown when user doesn't perform any of these operations in default.
In your main method: calculate all 4 results and have these printed in console.
Make sure to have dynamic inputs.*/

public class Taskno21 {
	public static void main(String[] args)  {
		Operations obj=new Operations();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for continue the operations or 0 for exit");
		int num=sc.nextInt();
		try {
			if(num==0) {
				throw new Exception("You did not perform any operation..");
			}
			else {
				System.out.println("Enter 1-for Plus ,2-for Minus,3-for divide ,4-for Multiply");
				int number=sc.nextInt();
				if(number<1 || number>4) {
					System.out.println("Choose the correct option ");
				}
				if(number==obj.plus) {
					System.out.println("Enter the values :");
					obj.plus(sc.nextDouble(),sc.nextDouble());
				}
				else if(number==obj.minus) {
					System.out.println("Enter the values :");
					obj.minus(sc.nextDouble(), sc.nextDouble());
				}
				else if(number==obj.divide) {
					System.out.println("Enter the values :");
					obj.divide(sc.nextDouble(),sc.nextDouble());
				}
				else if(number==obj.multiply) {
					System.out.println("Enter the values :");
					obj.multiply(sc.nextDouble(), sc.nextDouble());
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


