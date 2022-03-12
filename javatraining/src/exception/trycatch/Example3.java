package exception.trycatch;

public class Example3 {
	public static void main(String[] args) {
		 try {
			int num=4/0;  //may throw exception
			System.out.println(num);// due to the exception remaining statements will not be executed
		 }
		 catch(ArithmeticException e) {
			 System.out.println("No error");
		 }
		 finally {
			 System.out.println("Finally always executed");
		 }
		 System.out.println("yes");
	}
 }