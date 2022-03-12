package methodreferences;

	interface Babu{
		public void run();
	}
 class NonStaticReference{
		public void myMethod() {
			System.out.println("This is instance reference method");
		}
	}
public class MyClass {
	public static void main(String[] args) {
		NonStaticReference obj=new NonStaticReference();
		Babu b=obj::myMethod;
		b.run();
		

	}

}
