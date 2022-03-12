package lambdaexpressions;

public class SingleParameter {
	interface Babu1{
		public String run(String name);
		}
	public static void main(String[] args){
		Babu1 b1=(name)->{
			return "Hi"+ ""+name;};
	System.out.println(b1.run("Babu"));

	}
}


