package corejava.superkeyword;


	class Human{
		int i=2;
		void run () {
			System.out.println(i);
			System.out.println("the human can run");
		}
	}
	class Man extends Human{
		void eat() {
			System.out.println("he can eat");
		}
	}
	public class SuperKeyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man d=new Man();
		d.eat();
		d.run();

	}

}
