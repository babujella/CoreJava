package TestTasks;
import java.sql.Array;
import java.util.*;

import org.apache.poi.util.ArrayUtil;
public class Taskno7 {
	public static void main(String[] args) {
		int[] name= {1,2,3,4,3,5,3,2,8,4,6,4,9,6,7,4,4,2,1};
		HashMap<Integer,Integer> map=new HashMap<>();
		for (Integer key:name) {
			if (map.containsKey(key)) {
				map.put(key,map.get(key)+1);
			}
			else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
	}
}


