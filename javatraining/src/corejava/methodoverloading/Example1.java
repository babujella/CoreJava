package corejava.methodoverloading;

public class Example1 {
	 static int add(int x,int y) {
		 return x+y;
	 }
	 static int add(int i,int u,int j) {
		 return i+u+j;
	 }

	public static void main(String[] args) {
		int c=add(3,8);
		int z=add(4,9,0);
		System.out.println(c);
		System.out.println(z);


	}

}
