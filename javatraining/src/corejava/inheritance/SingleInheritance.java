package corejava.inheritance;


class Animal{
		void eat() {
			System.out.println("eating");
		}
	}
class Cat extends Animal{
		void meww() {
			System.out.println("meww mwee");
		}
	}
public class SingleInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.meww();
		c.eat();
	}

}
