package collectiontask;
import java.util.*;
public class Problem17 {
	//problem statemnt 17: A school offers medals to the students of tenth based on the following criteria
	//If(Marks>=90) : Gold
	//If(Marks between 80 and 90) : Silver
	//If(Marks between 70 and 80) : Bronze
	//Note: Marks between 80 and 90 means marks>=80 and marks<90
	//Write a function which accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal.
	//The input hashmap contains the student registration number as key and mark as value.
	//The output hashmap should contain the student registration number as key and the m
	public static void main(String[] args) {
		HashMap<String,Integer> obj= new HashMap<String,Integer>();
		obj.put("R1 -",90);
		obj.put("R2 -",80);
		obj.put("R3 -",70);
		for(String num:obj.keySet()) {
			System.out.println(num +obj.get(num));
			if(obj.get(num)>=90) {
				System.out.println(num+"Gold");}
			else if(obj.get(num)>=80 && obj.get(num)<90) {
				System.out.println(num + "Silver");}
			else if(obj.get(num)>=70 && obj.get(num)<80) {
				System.out.println(num + "Bronze");
				}
		}}
		}
		
	


