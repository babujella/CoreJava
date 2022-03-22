package TestTasks;

public abstract class Task22 implements Taskno22{
	public static void main(String args[]) {
		Taskno22 c =(sp,cp,name)->{
			int profit = sp-cp;
			return profit+ " "+name;
		};
		System.out.println(c.getCompanyDetails(500,49,"Virat Kohli"));
	}
}
