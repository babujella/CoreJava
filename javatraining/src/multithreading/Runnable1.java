package multithreading;


class Hii implements Runnable {
		public void run() {
			for(int i = 0;i<=5;i++) {
				System.out.println("hi");
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
class Helloo implements Runnable {
		public void run() {
			for(int i = 0;i<=5;i++) {
				System.out.println("Helooo");
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
	public class Runnable1 {
	public static void main(String[] args)  throws Exception {
		Hii h1=new Hii();
		Helloo h2=new Helloo();
		Thread t1=new Thread(h1);
		Thread t2=new Thread(h2);
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start();
		t2.start();
		System.out.println(t2.isAlive());
		

	}

}
