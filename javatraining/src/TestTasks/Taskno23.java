package TestTasks;

import java.util.ArrayList;
import java.util.Comparator;

/*Perform calculations such as count,sum,min,avg,max for given input of arrayList using Stream API.*/
public class Taskno23 {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(4);
		num.add(9);
		num.add(9);
		num.add(4);
		System.out.println(num);
		System.out.println("      Using sum operation");
		int sum = num.stream().mapToInt(i->i).sum();   
		System.out.println("Sum of the elements in the list  :"+sum);
		System.out.println("       Minimum and Maximum operation ");
		int number=num.stream().min(Comparator.comparing(Integer :: valueOf)).get();
		System.out.println("The minimum number is :"+number);
		int number1=num.stream().max(Comparator.comparing(Integer :: valueOf)).get();
		System.out.println("The maximum number is :"+number1);
		System.out.println("      Count operation");
		long b=num.stream().count();
		System.out.println("Count of the elements :"+b);
	}

}
