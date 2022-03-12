package corjava.polymorphisam;
	class Techouts{
		void work() {
			System.out.println("Techouts is a company");
		}
	}
	class Devoloper extends Techouts{
		void work() {
			System.out.println("Devolop the code");
		}
	}
	class Trainee extends Techouts{
		void work() {
			System.out.println("Training to frshers");
		}
	}
	public class PolyMorphisam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Techouts myWork=new Techouts();
		Techouts myDev=new Devoloper();
		Techouts myTrai=new Trainee();
		myWork.work();
		myDev.work();
		myTrai.work();

	}

}
