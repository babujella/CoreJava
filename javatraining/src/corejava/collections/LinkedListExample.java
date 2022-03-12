package corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


	class Student{
		int rollno;
		String name;
		int age;
		long fee;
		Student(int rollno,String name,int age,long fee){
			this.rollno=rollno;
			this.name=name;
			this.age=age;
			this.fee=fee;
		}
	}
	public class LinkedListExample {
	public static void main(String[] args) {
		Student b=new Student(1, "Babu", 20, 50000l);
		Student b1=new Student(2, "Aishu", 19, 40000l);
		Student b2=new Student(3, "Dhanu", 22, 42000l);
		LinkedList<Student> st=new LinkedList<Student>();
		st.add(b);
		st.add(b1);
		st.add(b2);
		for(Student s:st) {
			System.out.println(s.rollno+ " "+ s.name+" " + s.age+" " + s.fee);
		}

		}
}
