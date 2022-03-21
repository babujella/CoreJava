package TestTasks;

/*For any created thread, Observe the thread life cycle on each run.*/

	class Babu extends Thread{
		public void run() {

			System.out.println("My name is Babu");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	class Techouts extends Thread{
		public void run() {

			System.out.println("The company is Techouts");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	public class Taskno12 {
	public static void main(String[] args) throws InterruptedException {
		Babu babu=new Babu();
		Techouts techouts=new Techouts();
		babu.start();
		techouts.start();		
		babu.setPriority(1);
		techouts.setPriority(10);
		babu.join();
		techouts.join();
		System.out.println(babu.getPriority());
		System.out.println(techouts.getPriority());
		System.out.println(babu.isAlive());
		System.out.println(techouts.isAlive());
	}

}
