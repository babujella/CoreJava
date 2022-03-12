package exception.trycatch;

public class Example4 {

	public static void main(String[] args) {
		int num1=5;
		int num2=0;
		try {
			int num=num1/num2;
			throw new ArithmeticException();
			
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
	}

}
