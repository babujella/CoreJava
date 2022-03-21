package TestTasks;

/*hashCode(), equals(), toString() and .equals(), .parseInt()=>Perform programs*/
public class Taskno4 {
	int a;
	String name;
	Taskno4(int a,String name){
		this.a=a;
		this.name=name;
	}
	public int hashCode() {
		return a;
	}
	public String toString() {
		return a+"";
	}

	public static void main(String[] args) {
		Taskno4 obj=new Taskno4(100,"Babu");
		Taskno4 obj1=new Taskno4(1000,"123");
		System.out.println("HashCode is :"+obj.hashCode());
		System.out.println(obj.equals(obj1));
		System.out.println(obj1);

	}
}