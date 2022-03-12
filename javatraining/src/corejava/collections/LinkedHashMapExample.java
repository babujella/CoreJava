package corejava.collections;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> dhoni=new LinkedHashMap<Integer,String>();
		dhoni.put(9, "Babu");
		dhoni.put(4, "Babu1");
		dhoni.put(10, "Babu2");
		for(Integer i:dhoni.keySet()) {
			System.out.println(i+ " " + dhoni.get(i));
			
		}
	}

}
