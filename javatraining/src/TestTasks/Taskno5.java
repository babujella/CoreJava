package TestTasks;

/*Design a class OnlyOnce and make sure that only one time it is instantiated*/
public class Taskno5 {
	String name;
	public void myMethod(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Taskno5 obj=new Taskno5();
		obj.myMethod("My name is Jella Babu");

	}

}
