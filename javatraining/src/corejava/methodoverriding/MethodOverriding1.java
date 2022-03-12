package corejava.methodoverriding;

public class MethodOverriding1 {
	static int add(int a,int b) {
		return a+b;
	}
	static String add(String fname1,String fname2) {
		return fname1+fname2;
	}

	public static void main(String[] args) {
		int c=add(4,9);
		String n=add("Babu","Raju");
		System.out.println(c);
		System.out.println(n);
	}

}
