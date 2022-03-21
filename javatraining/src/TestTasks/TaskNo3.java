package TestTasks;


	/* With help of an anonymous inner class, implement any abstract method of the
	 * interface. Observe on working of anonymous Inner class here.
	 */
	interface MyClass{
		abstract void myMethod(int no,String name);
	}
	class Anonymus implements MyClass{
		public void myMethod(int no,String name) {
			System.out.println(no+" "+ name);
		}
	}
	public class TaskNo3 {
	public static void main(String[] args) {
		Anonymus obj=new Anonymus();
		obj.myMethod(1839,"Babu");
	}

}
