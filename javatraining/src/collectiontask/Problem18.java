package collectiontask;
import java.util.*;
public class Problem18 {
	
	static int i, j, mid;
	public static void main(String[] args) {
		ArrayList<String> nam=new ArrayList<String>();
		nam.add("babu");
		nam.add("raju");
		nam.add("venky");
		nam.add("Anji");
		nam.add("naveen");
		mid=nam.size()/2 + nam.size()%2;
		for(int i=0;i<mid;i++) {
			System.out.println(nam.get(i).toUpperCase());
		}
		for(int j=mid;j<nam.size();j++) {
			System.out.println(nam.get(j).toLowerCase());
		}
		
	}

}
