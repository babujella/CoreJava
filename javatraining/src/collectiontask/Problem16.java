package collectiontask;
import java.util.*;

public class Problem16 {
	public static void main(String[] args) {
		HashMap<String,Float> num= new HashMap<String,Float>();
		num.put("Selva :" , 75.6f);
		num.put("abi :" , 89.5f);
		num.put("ram :" , 40f);
		for(String i: num.keySet()){
		if(num.get(i)>60) {
			System.out.println(i + "pass");
		}
		else{
			System.out.println((i +"Fail"));
		}
		}
	


	}}


