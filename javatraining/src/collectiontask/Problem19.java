package collectiontask;

import java.util.*;
public class Problem19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> num=new TreeSet<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(5);
		num.add(7);
		 Iterator itr=num.descendingIterator();
		 System.out.println("Descending Order");
		 long startTime = System.currentTimeMillis();  		 
		 while(itr.hasNext()) {
			 System.out.println( itr.next());
		 }
		 System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
     
	}

}
