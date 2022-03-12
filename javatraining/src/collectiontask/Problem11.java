package collectiontask;

import java.util.*;

/* Write a program to synchronize a HashMap in java?*/
public class Problem11 {
	public static void main(String[] args) {
		try {
			HashMap<String,String> h=new HashMap<String,String>();
			h.put("18", "Kohli");
			h.put("49","Babu");
			h.put("97", "Venky");
			System.out.println(h);
			Map<String, String> h1=Collections.synchronizedMap(h);
			System.out.println(h1);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
