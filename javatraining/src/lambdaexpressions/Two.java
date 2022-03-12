package lambdaexpressions;

public class Two {
	interface Nunn{
		public String name(String fname);
	}
	public static void main(String[] args) {
		Nunn b=(name)->{
			String s1="Dont";
			String s2=s1+name;
			return s2;};
	System.out.println(b.name("Touch"));

	}
	}


