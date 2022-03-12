package corejava.inheritance;

	class Animal1{
		void eat() {
			System.out.println("eating");
		}
	}
	class Dog extends Animal1{
		void bark() {
			System.out.println("Barking");
		}
		
	}
	class BabyDog extends Dog{
		void sound() {
			System.out.println("sounding");
		}
	}
public class MultiLevel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d=new BabyDog();
		d.sound();
		d.bark();
		d.eat();

	}

}
