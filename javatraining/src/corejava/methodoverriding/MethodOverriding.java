package corejava.methodoverriding;


	class Techouts{
		void work() {
			System.out.println("working");
		}
	}
	class Devoloper extends Techouts{
		void work() {
			System.out.println("Devolop the code");
		}
	}
	public class MethodOverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Devoloper myObj=new Devoloper();
		myObj.work();

	}

}
