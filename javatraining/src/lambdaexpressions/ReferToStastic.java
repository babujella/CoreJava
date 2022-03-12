package lambdaexpressions;

public class ReferToStastic {
	interface Venky{
		public void black( );
	}
	class Study{
		public static void mrec( ) {
			System.out.println("Hii");
		}
	}
	public static void main(String[] args) {
		Venky s=Study:: mrec;
		s.black();
	}

}
