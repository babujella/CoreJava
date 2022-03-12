package corejava.collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap <String,Integer> bum=new HashMap<String,Integer>();
		bum.put("Babu",49);
		bum.put("Raghu",50);
		bum.put("Kailash",51);
		System.out.println("Before");
		for(String i:bum.keySet()) {
			
			System.out.println(i+ " "+ bum.get(i));
		}
		System.out.println("After ");
		bum.remove("Raghu",50);
		System.out.println(bum);
		
       for(Integer i:bum.values()) {
			
			System.out.println(i);
		}
       System.out.println("Modify");
       bum.put("venky",97);
       for(String i:bum.keySet()) {
			
			System.out.println(i+ " "+ bum.get(i));
	

	}

	}

}
