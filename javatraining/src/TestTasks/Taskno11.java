package TestTasks;

/*Display all the properties of running threads. Create 3 threads and 
 * rename thread1 to "yourName" and make this thread a daemon thread.
Get the updated thread details.*/

	class YourName extends Thread{
		public void run() {

			System.out.println("Welcome to Hyderabad");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	class MyClass1 extends Thread{
		public void run() {

			System.out.println("Welcome to Gachibowli");
			try {
				Thread.sleep(50);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	class MyClass2 extends Thread{
		public void run() {
			System.out.println("Welcome to Techouts");
			try {
				Thread.sleep(50);
			}catch(InterruptedException j) {
				System.out.println(j);
			}
		}
	}
	public class Taskno11 {
	public static void main(String[] args) {
		YourName myclass=new YourName();
		MyClass1 myclass1=new MyClass1();
		MyClass2 myclass2=new MyClass2();
		myclass.setName("Deamon");
		System.out.println("The thread name is :"+myclass.getName());
		myclass.start();
		myclass1.start();
		myclass2.start();
	}

}
