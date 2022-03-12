package methodreferences;

public class Static {
	interface Babu{
		public void bye();    //Interface method.
	}
	public class MyClass{
		public static void myMethod() {  //Static method.
			System.out.println("This is static reference method");
		}
	}
	public static void main(String[] args) {
		Babu b=MyClass::myMethod;  //Referring Static method
		b.bye();  //calling interface method
	}

}
