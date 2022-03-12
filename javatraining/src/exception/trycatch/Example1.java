package exception.trycatch;

public class Example1 {

	public static void main(String[] args) {
		try {
		int num=100/0; //may thrown exception
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Can't be divisible by Zero");
	}
	}


