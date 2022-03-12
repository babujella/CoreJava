package lambdaexpressions;

public class MultipleParameters {
	interface Babu2{
		public int num(int i,int j);
	}
	public static void main(String [] args) {
		Babu2 b2=(i,j)->(i*j);
		System.out.println(b2.num(100,200));	}
}
	
  