package lambdaexpressions;

	interface Raju{
		void run();
	}
	class White{
		public void dance() {
			System.out.println("He is good at Dancing ");
		}
	}
	public class ReferToInstance {
	public static void main(String[] args) {
		White w=new White();
		Raju r=w::dance;
		r.run();
		

	}

}
