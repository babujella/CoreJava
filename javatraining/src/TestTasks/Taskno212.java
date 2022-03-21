package TestTasks;

/*21. Class named Operations have final variables like plus,minus,divide and multiply.
This class has a method named calculate which takes 2 inputs of type double and return value in double
inside calculate: if plus, inputs are added and returned.(similarly for other methods minus,divide and multiply).
AssertionError is also thrown when user doesn't perform any of these operations in default.
In your main method: calculate all 4 results and have these printed in console.
Make sure to have dynamic inputs.*/
class Operations{
	final double plus = 1;
	final double minus=2;
	final double divide=3;
	final double multiply=4;
	void claculate(double plus,double minus,double multiply,double divide) {
		return;
	}
	void plus(double c,double d) {
		System.out.println(c+d);
	}
	void minus(double c,double d) {
		System.out.println(c-d);
	}
	void divide(double c,double d) {
		System.out.println(c/d);
	}
	void multiply(double c,double d) {
		System.out.println(c*d);
	}
}
