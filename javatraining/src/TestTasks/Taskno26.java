package TestTasks;

import java.util.Optional;
import java.util.StringJoiner;

/*Perform handson on every methods on OptionalClass, ParallelSort, StringJoiner,Collector class in Streams*/

public class Taskno26 {
	public static void main(String[] args) {
		StringJoiner joiner=new StringJoiner(",");  //String joiner
		joiner.add("Babu");
		joiner.add("Raghu");
		joiner.add("Kailash");
		System.out.println(joiner);
		System.out.println("    By using optional class :");
		String[] str=new String[10];
		str[6]="i am here";
		str[5]="I AM BABU";
		Optional<String> checknull=Optional.ofNullable(str[6]);
		Optional<String> checknulll=Optional.ofNullable(str[6]);
		if(checknull.isPresent() || checknulll.isPresent()) {
			String i=str[6].toUpperCase();
			String j=str[5].toLowerCase();
			System.out.println(i);
			System.out.println(j);
		}
		else {
			System.out.println("Exception is there.");
		}
	}
}
