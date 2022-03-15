package exceptiontask;

import java.util.ArrayList;
import java.util.Scanner;
/*WAP on custom exception where it gives an 'Invalid Employee ID' Exception while entering into an Organization or office .
Create a pojo class that contains Employee details including name ,id ,address .If ID is not found must give exception mesaage that "given Employee ID is not found or mismatched ,
please enter the valid ID" and if ID is found give message as "Welcome to office". Take input from user and check the ID with the already existing Employee ids
Note: Please add multiple employee details*/

class InvalidEmployeeID extends Exception{
	public InvalidEmployeeID(String s) {
		super(s);
	}
}
class Employee {
	String name;
	int id;
	//boolean bool = true;
	String adress;
	public Employee(String name,int id,String adress) {
		this.name=name;
		this.id=id;
		this.adress=adress;
	}}
public class Test{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee m=new Employee("Babu",1839,"Hyd");
		Employee m1=new Employee("Venky",1840,"Sdpt");
		Employee m2=new Employee("Raju",1831,"Knr");
		ArrayList<Employee> obj=new ArrayList<Employee>();
		obj.add(m);
		obj.add(m1);
		obj.add(m2);
		try {
			System.out.println("Enter the Id :");
			int idNum=sc.nextInt();
			for(Employee i: obj) {
				if(i.id==idNum) {
					System.out.println("Welcome to the Office "+i.name +" ");
					break;
				}
				else  {
					throw new Exception("given Employee ID is not found or mismatched..Please enter valid ID");
				}}}
					catch(Exception e) {
						System.out.println(e);
					}

				}
			}
		




