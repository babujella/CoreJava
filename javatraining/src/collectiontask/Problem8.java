package collectiontask;
import java.util.*;
import java.util.Iterator;

public class Problem8 {

	public static void main(String[] args) {
		TreeMap<String,Integer> a=new TreeMap<String,Integer>();
		a.put("a1",1);
		a.put("a2",12);
		a.put("a3",13);
		a.put("a4",14);
		System.out.println("TreeMap :"+a);
		Iterator itr=a.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
