package lambdaexpressions;

public class Lambda {
	interface Babu{
		public void run(); 
	}
	public static void main(String[] args) {
		int w=10;
		Babu b=()->{
			System.out.println(w);};
		b.run();
	}

}
