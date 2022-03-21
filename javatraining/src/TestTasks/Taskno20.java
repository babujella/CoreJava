package TestTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/*Methods of Iterator:hasNext(),next(),remove()
Methods of ListIterator:add(E e),hasNext(),hasPrevious(),next(),nextIndex(),previous(),previousIndex(),remove(),set(E e) */
public class Taskno20 {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.remove(1);
		num.add(8);
		num.set(5,10);
		System.out.println(num);
		System.out.println("Using iterator :");
		Iterator itr=num.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using Listerator :");
		ListIterator obj=num.listIterator(num.size());
		while(obj.hasPrevious()) {
			Object number=obj.previous();
			System.out.println(number);
		}
	}

}
