package corejava.binding1;


	class TCS{
		void work() {
			System.out.println("Working");
		}
	}
	class Devoloper extends TCS{
		void work() {
			System.out.println("The do coding");
		}
	}
	public class DynamicBinding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCS myObj=new Devoloper();
		myObj.work();

	}

}
