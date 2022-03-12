package collectiontask;
import java.util.*;
import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {
     // Using Arrays.asList() method
		String [] arr= {"Babu","Raghu","Kailash"};
		System.out.println("Using 1st method");
		List n=Arrays.asList(arr);
		System.out.println(n);
		
	// Using Collection.addAll() Method
		System.out.println("Using 2nd method");
		ArrayList<String> nam =new ArrayList<String>();
		Collections.addAll(nam,arr);
		System.out.println(nam);
	}

}
