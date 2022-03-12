package multithreadingtask;

/*A thread has "add" operation,other thread performs"avg" and other thread performs "display" operation which displays avg and add
 *  details after the two threads are compeletely performed.
 */

	class Add extends Thread{
		static int c;
		public void run() {
			int a=4;
			int b=8;
			c=a+b;
		}		
	}
	class Avg extends Thread{
		static float c;
		public void run() {
		float a=4;
		float b=8;
		c=((a+b)/2);
	}
	}
		class Display extends Thread{
			public void run() {
				System.out.println("The operation of Adding is :"+Add.c);
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					System.out.println(e);
				}
				System.out.println("The operation of Avarage is :" +Avg.c);
			}
		}

	public class Problem2 {
	public static void main(String[] args) {
		Add a1=new Add();
		Avg a2=new Avg();
		Display d=new Display();
		a1.start();
		
		try {
			Thread.sleep(500);
		}
		catch(Exception k) {
		}
		a2.start();
		d.start();
		
	}

	}



