package java8;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String[] str=new String[10];
		str[5]="hii";
		 Optional<String> b = Optional.ofNullable(str[5]);  
		 if(b.isPresent()) {
		 System.out.println(str[5].toUpperCase());
	}
	else {
		System.out.println("Exception is there");
	}

	}
}
