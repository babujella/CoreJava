package methodoverriding;

	class Animal{
		String colour="White";
	}
	class Dog extends Animal{
		String colour="Black";

		public void num() {
			System.out.println(colour);
			System.out.println(super.colour);
			
		}
	}
	public class Colourr {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.num();

	}

}
