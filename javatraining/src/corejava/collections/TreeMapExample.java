package corejava.collections;
import java.util.TreeMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> kohli=new TreeMap<Integer,String>();
		kohli.put(9,"Babu");
		kohli.put(2, "Raju");
		kohli.put(1, "venky");
		kohli.put(10,"Anji");
		for(Integer i:kohli.keySet()) {
			System.out.println(i +" "+ kohli.get(i)  );
			
		}

	}

}
