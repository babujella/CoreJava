package multithreading;


	class Tech{
		synchronized void babu(int j) {
			for(int i=0;i<=5;i++) {
				System.out.println(j*i);
			}
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	class Tech1 extends Thread{
		Tech t;
		Tech1(Tech t){
			this.t=t;
		}
		public void run() {
			t.babu(2);
		}
	}
	class Tech2 extends Thread{
		Tech j;
		Tech2(Tech t){
			this.j=t;
		}
		public void run() {
			j.babu(1);
		}
	}
	class Babu extends  Thread{
		Tech b;
		Babu(Tech b){
			this.b=b;
		}
		public void run() {
			b.babu(1);
		}
	}
	public class Synchro {
	public static void main(String[] args) {
		Tech m=new Tech();
		Tech1 m1=new Tech1(m);
		Tech2 m2=new Tech2(m);
		Babu b=new Babu(m);
		m1.start();
		m2.start();
		b.start();

	}

}
