package java8;
import java.util.StringJoiner;
public class StringJoin {
	public static void main(String[] args) {
		StringJoiner b3=new StringJoiner(",");  //Passing comma(,) as Delimiter.
		b3.add("Babu");                          //Adding values to the StringJoiner.
		b3.add("Dhanu");
		b3.add("Gattu");
		System.out.println(b3);
	System.out.println("Adding prefix and suffix :");
	StringJoiner b4=new StringJoiner(":","[","]");  //Passing , [ ] as delimiter.
	b4.add("Babu");
	b4.add("Dhanu");
	b4.add("Gattu");
	System.out.println(b4);
	
	System.out.println("Merging :");   //Merging
	StringJoiner b=b3.merge(b4);
	System.out.println(b);
}
}
