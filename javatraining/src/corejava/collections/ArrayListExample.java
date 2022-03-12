package corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(4);
		num.add(9);
		num.set(3, 90);
		System.out.println("The changed number is :" +num.get(3));
		for(int i=0;i<num.size();i++) {
			
			System.out.println("The number is"+num.get(i));
		}
		num.set(3,9);
	System.out.println("The added number is : "+num.get(3));
	
	for(int i:num) {    //For each method
		System.out.println("The number is :"+ i);
	}
	
	
	Iterator itr=num.iterator();   //Using Iterator 
	while(itr.hasNext()) {        //Checking
		System.out.println(itr.next());  //Printing
	}
	
	
	ListIterator<Integer> litr=num.listIterator(num.size());  //by using ListIterator
	while(litr.hasPrevious()) {
		int number=litr.previous();
		System.out.println(number);
		
	}
	

}}
