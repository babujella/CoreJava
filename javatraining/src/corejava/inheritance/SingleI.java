package corejava.inheritance;


	class Lap{
		void key() {
			System.out.println("Key");
		}
	}
	class Tv1 extends Lap{
		void colour() {
			System.out.println("CXo");
		}
	}
	public class SingleI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv1 obj =new Tv1();
		obj.colour();
		obj.key();

	}

}
