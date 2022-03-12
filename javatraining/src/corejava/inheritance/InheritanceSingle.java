package corejava.inheritance;


	class Laptop{
		void key() {
			System.out.println("KEY");
		}
	}
	class Tv extends Laptop{
		void colour() {System.out.println("Noo");
	}
public class InheritanceSingle {
	public static void main(String[] args) {
		Tv obj=new Tv();
		obj.colour();
		obj.key();
	}
		// TODO Auto-generated method stub

	}

}
