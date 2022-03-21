package TestTasks;

/*Implement one-many association for Company and Employee.(Make sure to have rating,startYear for Employee)*/
public class Taskno1 {
	public static void main(String[] args) {
		Company obj=new Company("Babu",17,"Tenth","Blue");
		Company obj1=new Company("Venky",26,"Tenth","Green");
		Company obj2=new Company("Raju",27,"Tenth","red");
		Company obj3=new Company("Anji",16,"Tenth","Yellow");
		System.out.println(obj.name+" "+obj.id+" "+obj.standard+" "+obj.uniform);
		System.out.println(obj1.name+" "+obj1.id+" "+obj1.standard+" "+obj1.uniform);
		System.out.println(obj2.name+" "+obj2.id+" "+obj2.standard+" "+obj2.uniform);
		System.out.println(obj3.name+" "+obj3.id+" "+obj3.standard+" "+obj3.uniform);
	}

}
