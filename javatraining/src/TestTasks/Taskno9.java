package TestTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Taskno9 {

	public static void main(String[] args) {
		ArrayList<String> num=new ArrayList<String>();
		num.add("Babu");
		num.add("Vishnu");
		num.add("Balaji");
		num.add("Mahendar");
		num.add("Manikanta");
		num.add("Prashanth");
		System.out.println("                Using iterator :");
		Iterator itr=num.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("                  Using Listiterator :");
		ListIterator obj=num.listIterator(num.size());
		while(obj.hasPrevious()) {
			Object number=obj.previous();
			System.out.println(number);
		}
	}
}