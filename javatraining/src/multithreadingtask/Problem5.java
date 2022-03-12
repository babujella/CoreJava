package multithreadingtask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*5. Exceptions with many catches and its order of execution.examine on specific to general. Make sure to include 
 * both compile time and runtime exceptions in it.
try followed by catch and finally with return in all blocks. Examine output. 
		try followed by catch with return in both blocks. Examine output.*/


	class ThreadOne extends Thread{
		public void run() {
			System.out.println("First Thread");
			try {
				int arr[]= {1,2,3,4};
				 arr[10]=10/0;
				System.out.println(arr);
			}
			catch(ArithmeticException e) {
				System.out.println("The ArithmeticException  is handled "+e);
			}
			catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("The ArrayIndexOutOfBoundsException is handled "+ae);
			}
			catch(Exception d) {
				System.out.println(d);
			}
			finally {
				System.out.println("Execute the remaining statements or programm");
			}
			System.out.println("Remaining");
		}
	}
	class ThreadTwo extends Thread{
		public void run() {
			System.out.println("Second Thread");
				try {
					Thread.sleep(1000);
					FileInputStream i=new FileInputStream(("D:\\testout.txt"));
				}
				catch(FileNotFoundException ee){
					System.out.println("The FileNotFoundException is handled "+ee);
				}
				catch(InterruptedException jj) {
					System.out.println("The InterruptedException is handled "+ jj);
				}
				catch(Exception e) {
					System.out.println("The Exception is handled");
				}
				System.out.println("All exceptions are handled");
		}
	}
	public class Problem5 {
	public static void main(String[] args) {
		ThreadOne b=new ThreadOne();
		ThreadTwo b1=new ThreadTwo();
		b.start();
		try {
			Thread.sleep(10000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		b1.start();
		b.interrupt();
		b1.interrupt();
		
	}

}
