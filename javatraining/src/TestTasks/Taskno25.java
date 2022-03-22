package TestTasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Using Consumer Interface,print stream of integers ranging from 1 to 10 and double these numbers in your output*/
public class Taskno25 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> doubleArray = list.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println("Double values of ArrayList Integers: "+doubleArray);
	}
}

