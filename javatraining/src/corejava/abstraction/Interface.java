package corejava.abstraction;


	interface Father{
		void walk();
	}
	class Son implements Father{
		public void walk() {
			System.out.println("Son is walking");
		}
	}
	public class Interface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son myObj=new Son();
		myObj.walk();

	}

}
