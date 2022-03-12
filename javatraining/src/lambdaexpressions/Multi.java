package lambdaexpressions;

public class Multi {
	interface Techouts{
		public int number(int i,int j,int k);
	}
	public static void main(String[] args) {
		Techouts t=(i,j,k)->(i+j-k);
		System.out.println(t.number(100,2,100));

	}

}
