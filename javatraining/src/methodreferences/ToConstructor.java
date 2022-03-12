package methodreferences;

	interface Babu8{
		void run(String num);
	}
	class Name{
		Name(String num){
			System.out.println(num);
		}
	}
	public class ToConstructor {

	public static void main(String[] args) {
		Babu8 b=Name::new;
		b.run("7675073929");
		

	}

}
