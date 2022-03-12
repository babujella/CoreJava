package multithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Techouts implements Serializable{
		String name;
		int id;
		String place;
		Techouts(String name,int id,String place){
			this.name=name;
			this.id=id;
			this.place=place;
		}
	}
	public class Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		Techouts t=new Techouts("Babu",1839,"Gachibowli");                    
			FileOutputStream obj=new FileOutputStream("D:\\file\\file.txt");      //Serialization
			ObjectOutputStream obj1=new ObjectOutputStream(obj);
			obj1.writeObject(t);
			obj1.flush();
			System.out.println("Success");
			obj1.close();
			
			ObjectInputStream i=new ObjectInputStream(new FileInputStream("D:\\file\\file.txt"));   //Deserialization
			Techouts s=(Techouts)i.readObject();
			System.out.println(s.name+" "+s.id+" "+s.place);
	}
	}


