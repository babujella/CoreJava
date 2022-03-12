package methodreferences;

	interface Raju{
		default void work() {
			System.out.println("Friends.");
		}
	}
	interface Babu0 extends Raju{
		void run(String name);
	}
	class Babu89 implements Babu0{
		public void run(String name) {
			System.out.println(name);
		}
	}
	public class Function {
	public static void main(String[] args) {
		Babu89 b=new Babu89();
		b.run("Best");
		b.work();

	}

}
