package TestTasks;

public class TaskTwo {
	public static void main(String[] args) {
		Trainee obj=new Trainee("Babu");
		Trainee obj1=new Trainee("Raju");
		StudyMaterial obj2=new StudyMaterial("Geetam");
		StudyMaterial obj3=new StudyMaterial("Versa");
		System.out.println(obj.name+  " has materials like : "+obj2.material+ " and " +obj3.material);
		System.out.println(obj1.name + " has materials like :" +obj3.material + " and " +obj2.material);
	}
}
