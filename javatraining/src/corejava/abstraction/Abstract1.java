package corejava.abstraction;


	abstract class Siddipet{
		abstract void city();            //abstract method
	}
	class Jakkapur extends Siddipet{
		void city() {
			System.out.println("Beautiful");
		}
	}
	class Jkpr extends Siddipet{
		void city() {
			System.out.println("Nice");
		}
	}
	public class Abstract1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Siddipet n=new Jkpr ();
		n.city();

	}

}
