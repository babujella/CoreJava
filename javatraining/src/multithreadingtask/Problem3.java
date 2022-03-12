package multithreadingtask;
/*Display all the properties of running threads. Create 3 threads and rename thread1 to "yourName" and
 *  make this thread a daemon thread.Get the updated thread details.
 */


	class Thread0 extends Thread{
		 public void run(){  
		 }
	}
		 class Thread1 extends Thread{
			 public void run() {
				 System.out.println("This is thread one");
				 try {
					 Thread.sleep(500);
				 }
				 catch(Exception e) {
					 System.out.println(e);
				 }
			 }
		 }
		 class Thread2 extends Thread{
			 public void run() {
				 System.out.println("This is thread two");
				 try {
					 Thread.sleep(500);
				 }
				 catch(Exception e) {
					 System.out.println(e);
				 }
			 }
		 }
	public class Problem3{	 
	public static void main(String[] args) throws Exception {
		Thread0 b=new Thread0();
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		b.setName("Babu");
		System.out.println("The name is :"+b.getName());
		b.setDaemon(true);
		System.out.println("This is daemon thread :"+b.isDaemon());
		b.start();
		t1.start();
		t2.start();
		 try {
			 Thread.sleep(500);
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		t1.join();
		System.out.println(t1.isAlive());
		
	 }	
	
	}
		 
	
