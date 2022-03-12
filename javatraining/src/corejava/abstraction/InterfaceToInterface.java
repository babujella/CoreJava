package corejava.abstraction;


	interface Hyderabad{
		void crowd();
	}
	interface Mumbai{
		void crowd();
	}
	class People implements Hyderabad,Mumbai{
		public void crowd() {
			System.out.println("too much");
		}
	}
	public class InterfaceToInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People obj=new People();
		obj.crowd();

	}

}
