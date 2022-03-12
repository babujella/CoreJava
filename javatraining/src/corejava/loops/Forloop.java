package corejava.loops;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=1;
		 long startTime = System.currentTimeMillis();  		 
		for(num1=1;num1<=10;num1++) {
			System.out.println("number"+num1);
		}
		 System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  


	}

}
