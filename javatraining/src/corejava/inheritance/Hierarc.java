package corejava.inheritance;


	class Corona{
		void death() {
			System.out.println("Loss of");
		}
	}
	class Omicron extends Corona{
		void loss() {
			System.out.println("No more");
		}
	}
	class C19 extends Corona{
		void same() {
			System.out.println("Same");
		}
	}
	public class Hierarc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C19 obj=new C19();
		obj.same();
		obj.death();
		Omicron obj1=new Omicron();
		obj1.loss();
		obj1.death();

	}

}
