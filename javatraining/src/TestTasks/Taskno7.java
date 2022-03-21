package TestTasks;
import java.sql.Array;
import java.util.*;

import org.apache.poi.util.ArrayUtil;
public class Taskno7 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int[] name= {1,2,3,4,3,5};
		for(int i=0;i<=name.length;i++) {
			map.put(map.get(name[i]+1),name[i]);
			System.out.println(map.get(i));
		}
	}
}


