package corejava.abstraction;


	abstract class Techouts{
		abstract void work();
	}
	class Soft extends Techouts{
		void work() {
			System.out.println("Software");
		}
	}
	public class AbstractClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Techouts obj=new Soft();
		obj.work();

	}

}
