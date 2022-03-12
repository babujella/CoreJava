package corejava.datatypesoperators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=5;
		int num2=10;
		int num3=15;
		   //Arithematic operations
		int result1=(num1+num2);
		int result2=(num2-num1);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(num1*num2);
		System.out.println(num3/num2);
		
		//Relational operators
		System.out.println(num1 > num2);
		System.out.println(num2 < num3);
		System.out.println(num1 <= num3);
		System.out.println(num3 >= num1);
		System.out.println(num3 > num1);
		
		//logical operators
		System.out.println(num1>num2 && num3<num2);
		System.out.println(num2<num1 || num2>num3);
		System.out.println(num2<num1 & num1>num2);
		System.out.println(num3>num1 | num2>num1);
		
		//shift operator
		System.out.println(num1>>2);
		System.out.println(num3<<1);
		System.out.println(num2>>>1);

	}

}
