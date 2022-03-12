package corejava.controlstatements;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		if(num%3==0){
			System.out.println("Father");
		} 
		else if(num%5==0){
			System.out.println("mother");
		}
		else if((num%2==0) && (num%5==0)) {
			System.out.println("me");
		}
		

	}

}
