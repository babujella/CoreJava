package corejava.loops;

public class Main {
	static int babu(int x,int y) {
		return x+y;
	}
	static float babu(float a,float b){
		return a+b;
	}
	static double babu(double n,double m) {
		return n-m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z= babu(2,3);
		float c=  babu (4 ,5);
		double f= babu(4,7);
		System.out.println(z);
		System.out.println(c);
		System.out.println(f);

	}

}
