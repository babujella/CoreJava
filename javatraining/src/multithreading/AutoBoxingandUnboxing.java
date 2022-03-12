package multithreading;

public class AutoBoxingandUnboxing {
	public static void main(String[] args) {
		int a=10;
		int b=222;
		Integer i=new Integer(a);    //AutoBoxing 
		System.out.println(i);
		System.out.println(b);
		
		Integer n=new Integer(20);   //Unboxing
		int m=n;
		System.out.println(m);
	}

}
