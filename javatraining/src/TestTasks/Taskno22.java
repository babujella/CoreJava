package TestTasks;


/*Provide an interface Company with
default method of return type double calculating the profit(CP-SP)
static method of return type String which takes (double) input from previous method and returns company name.
Abstract method String getCompDetails(double profit,String name);=>Needs to be implemented using Lambda expression.*/
public interface Taskno22 {
	abstract String getCompanyDetails(int sp,int cp, String name);
}

