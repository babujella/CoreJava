package corejava.inheritance;


 class Animal2{
	 
	void eat() {
		
			System.out.println("Eating");
		}
	}
class Horse extends Animal2{
	void sound() {
		
		System.out.println("Sounding");
		
		}
	}
class Don extends Animal2{
	
	void mewo() {
			System.out.println("mewwwww");
		}
	}
public class Hierarchial {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Don c =new Don();
		Horse d=new Horse();
		d.sound();
		d.eat(); 
		c.mewo();
		c.eat();
		

	}

}
