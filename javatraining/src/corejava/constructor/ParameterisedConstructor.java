package corejava.constructor;

public class ParameterisedConstructor {
	int a;
	int b;
	ParameterisedConstructor(int a,int b){
		int c=a+b;
		System.out.println("This is ParameterisedConstructor "+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterisedConstructor obj = new ParameterisedConstructor(5,6);

	}

}
