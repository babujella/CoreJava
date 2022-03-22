package TestTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/*Using Consumer Interface,print stream of integers ranging from 1 to 10 and make sure to neglect numbers between 3 and 7.
 */
class ConsumerInterface{
	static void myMethod(List<Integer> list) {
		List<Integer> babu = list.stream().filter(x->x<3||x>7).map(x->x).collect(Collectors.toList()); 
		babu.forEach(n->System.out.println(n));
	}
}
public class Taskno24 {
	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<Integer>();
		for (int i=1;i<=10;i++) {
			ls.add(i);
		}

		Consumer<List<Integer>> con = ConsumerInterface::myMethod;  
		con.accept(ls);


	}

}


