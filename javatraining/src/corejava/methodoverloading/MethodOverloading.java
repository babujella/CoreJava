package corejava.methodoverloading;

public class MethodOverloading {
	static void add(int x,int y) {
		System.out.println(x+y);
	}
	static void add(float a,float b,float c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.add(2, 6);
		obj.add(98, 7);
	}

}
