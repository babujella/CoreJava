package collectiontask;
import java.util.*;
import java.util.Map.Entry;
public class Prolem3 {

	public static void main(String[] args) {
		HashMap<String,String> name =new HashMap<>();
		name.put("India","NewDelhi");
		name.put("Afghanistan", "Kabul");
		name.put("Albania","Tirana");
		name.put("Algeria","Algiers");
		System.out.println("HashMap :" +name);
		System.out.println("Using Entryset along for each loop :");
		for(Entry<String, String> i: name.entrySet()) {  //EntrySet along for each loop
			System.out.println(i);
	}
		System.out.println("Using KeySet Iterator :");
		for(String n: name.keySet()) {                  //Using KeySet Iterator
			System.out.println(n);
}
		System.out.println("Using Iterator :");
		Iterator itr=name.entrySet().iterator();
		while(itr.hasNext()) {//Checking
		System.out.println(itr.next());
		
	
		
		}
	}
		}
