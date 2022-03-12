package lambdaexpressions;
import java.util.*;
public class ForEach {
	public static void main(String[] args) {
		ArrayList<String> b=new ArrayList<String>();
		b.add("Babu");
		b.add("Aish");
		b.add("Dhanu");
		b.forEach((n)->System.out.println(n));
	}

}
