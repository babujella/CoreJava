package corejava.statick;

public class Student {
	int no;
	String name;
	static String clg="MREC";
	
	Student(int no,String name){
		System.out.println(no+name+clg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1, "Babu");
		Student s2=new Student(2, "Venky");

	}

}
