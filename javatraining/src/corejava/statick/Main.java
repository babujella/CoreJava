package corejava.statick;

public class Main {
	String name;
	int num;
	static String college="Mrec";
	 static void babu() {
		college="MREC";
	}
	 Main(String name,int num){
		 System.out.println(name+ " "+ num+" "+college);
	 }
	public static void main(String[] args) {
		Main b=new Main("Babu",85);
		Main a=new Main("Sagar",89);
	}

}
