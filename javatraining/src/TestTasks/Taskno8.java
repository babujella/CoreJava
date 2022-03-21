package TestTasks;

import java.util.TreeSet;

/*Using TreeSet, make sure to add varied data types to the set including Upper and Lower case and predict your output.*/
public class Taskno8 {
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add("babu");
		set.add("Babu");
		set.add("BABU");
		set.add("baBu");
		set.add("Venky");
		set.add("Raju");
		set.add("Babu");   //Duplicates are not allowed
		System.out.println(set);
	}
}
