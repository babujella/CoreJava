package collectiontask;
import java.util.*;
public class Problem5 {
	public static void main(String[] args) {
		LinkedList<String> b=new LinkedList<String>();
		b.add("Kohli");
		b.add("Dhoni");
		b.add("Siraj");
		b.add("ABD");
		b.add("KL Rahul");
		System.out.println("The elements are in the LinkedList :"+ b);
		System.out.println("The elements are in the ArrayList :");
		List<String> fav=new ArrayList<String>(b);
		for(String i:fav) {
		System.out.println( i);
		}
	HashSet<String> n=new HashSet<String>();
	n.add("a");
	n.add("b");
	n.add("c");
	n.add("d");
	System.out.println("HashSet :");
	System.out.println(n);
	String[] arr=new String[n.size()];
	n.toArray(arr);
	System.out.println("Changed to Array :");
	for(String i:arr) {
		System.out.println(i);
		}
	
	System.out.println("reverse ArrayList in java :");
	ListIterator<String> b1=b.listIterator(b.size());
	while(b1.hasPrevious()) {
		String b2=b1.previous();
		System.out.println(b2);
	}
	
	
	
	
	
	
	
	
}}





