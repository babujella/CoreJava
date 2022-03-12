package multithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
		String name;
		int rollno;
		String standard;
		Student(String name,int rollno,String standard){
			this.name=name;
			this.rollno=rollno;
			this.standard=standard;
		}
	}
	public class Example {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s=new Student("Babu",17,"A");
		Student s1=new Student("Raghu",18,"A+");
		Student s2=new Student("Kailash",19,"O");
		FileOutputStream f=new FileOutputStream("D:\\Babu\\Babu.txt");
		ObjectOutputStream j=new ObjectOutputStream(f);
		j.writeObject(s);
		j.writeObject(s1);
		j.writeObject(s2);
		System.out.println("Success");
		System.out.println("The object succesfully convert into stream");
		
		ObjectInputStream q=new ObjectInputStream(new FileInputStream("D:\\Babu\\Babu.txt"));
		Student w=(Student)q.readObject();
		Student w1=(Student)q.readObject();
		Student w2=(Student)q.readObject();
		System.out.println(w.name+" "+w.rollno+" "+w.standard);
		System.out.println(w1.name+" "+w1.rollno+" "+w1.standard);
		System.out.println(w2.name+" "+w2.rollno+" "+w2.standard);
	}

}
