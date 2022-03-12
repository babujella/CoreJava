package lambdaexpressions;

public class NoParameters {
	interface Babu1{
		public String name();
	}
	public static void main(String[] args) {
		Babu1 b1=()->{
			return "Nothing";};
	System.out.println(b1.name());
	}
	}



