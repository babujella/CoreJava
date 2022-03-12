package corejava.inheritance;

	class Chair{
		void sit() {
			System.out.println("For sitting");
		}
	}
	class Table extends Chair{
		void siti() {
			System.out.println("Not for sitting");
		}
	}
	class Floor extends Table{
		void sittin(){
			System.out.println("For sleeping");
		}
	}
	public class MultiL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Floor obj=new Floor();
		obj.sittin();
		obj.siti();
		obj.sit();
		

	}

}
