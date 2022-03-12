package methodreferences;

import java.util.function.BiFunction;

public class BiFunctional {
	class Maths{
		public static int function(int a,int b) {
			return a+b;
		}
		public static float function(int c,float d) {
			return c+d;
		}
		public static float function(float e,float f) {
			return e+f;
		}
	}
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> b=Maths::function;
		BiFunction<Integer,Float,Float> b1=Maths::function;
		BiFunction<Float,Float,Float> b2=Maths::function;
		int r=b.apply(10,20);
		Float r1=b1.apply(100,200.6f);
		float r2=b2.apply(2f,3.7f);
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
	}

}
