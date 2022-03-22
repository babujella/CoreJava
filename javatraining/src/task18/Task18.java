package task18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task18 {
	public static void main(String[] args) {
		ArrayList<Employeee> list=new ArrayList<Employeee>();
		Employeee emp=new Employeee("Babu",2001,40);
		Employeee emp1=new Employeee("Raju",2011,50);
		Employeee emp2=new Employeee("Venky",2021,60);
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		Collections.sort(list,new Rating());
		Collections.sort(list,new StartYear());
		for(Employeee i: list) {
			System.out.println("Name of the Employee :"+i.name+" , "+"Employee rating :"+i.rating+" , "+"Employee year :"+i.startYear);
		}
	}
}
