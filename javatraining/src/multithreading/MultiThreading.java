package multithreading;

	class Hi extends Thread{
		 public void run() {
			for(int i = 1;i<=5;i++) {
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
		class Hello extends Thread{
			public void run() {
				for(int i = 1;i<=5;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				}
				catch(Exception r) {
					System.out.println(r);
				}
			}
		}
	}
	public class MultiThreading {
	public static void main(String[] args) throws Exception {
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		obj1.setPriority(1);
		obj2.setPriority(10);
		obj1.start();
		try {
			Thread.sleep(50);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		obj2.start();
		obj1.join();
		obj2.join();
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		System.out.println(obj1.isAlive());
		System.out.println(obj2.isAlive());

	
		
		

	}

}
