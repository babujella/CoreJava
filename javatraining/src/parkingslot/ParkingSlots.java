package parkingslot;
import java.util.*;
public class ParkingSlots {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean a=true;
		HashMap<Integer,String> Car=new HashMap<>();{
			Car.put( 1,"-Slot no");
			Car.put( 2,"-Slot no");
			Car.put( 3,"-Slot no");
			Car.put( 4,"-Slot no");
			Car.put( 5,"-Slot no");
			Car.put( 6,"-Slot no");
			Car.put( 7,"-Slot no");
			Car.put( 8,"-Slot no");
			Car.put( 9,"-Slot no");
			Car.put( 10,"-Slot no");
			Car.put( 11,"-Slot no");
			Car.put( 12,"-Slot no");
			Car.put( 13,"-Slot no");
			Car.put( 14,"-Slot no");
			Car.put( 15,"-Slot no");

			
		HashMap<Integer,String> Bike=new HashMap<>();{
			Bike.put(1,"-Slot no");
			Bike.put(2,"-Slot no");
			Bike.put(3,"-Slot no");
			Bike.put(4,"-Slot no");
			Bike.put(5,"-Slot no");
			Bike.put(6,"-Slot no");
			Bike.put(7,"-Slot no");
			Bike.put(8,"-Slot no");
			Bike.put(9,"-Slot no");
			Bike.put(10,"-Slot no");
			Bike.put(11,"-Slot no");
			Bike.put(12,"-Slot no");
			Bike.put(13,"-Slot no");
			Bike.put(14,"-Slot no");
			Bike.put(15,"-Slot no");
		}
		while(a) {
		System.out.println("Checking the type of vehicle : 1.Bike , 2.Car");
		int n=sc.nextInt();
		if(n==1) {
			System.out.println("Go to the Basement 1");
			System.out.println("List of Available slots :");
			Iterator itr=Bike.entrySet().iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("Enter the slot number :");
			int j=sc.nextInt();
			if(Bike.containsKey(j)) {
				System.out.println("RECEIPT:The slot is Succesfully booked...");
				Bike.remove(j);
			}
			else {
				System.out.println("The slot is already Booked..Choose another");
			}
		}
		if(n==2) {
			System.out.println("Go to the Basement 2");
			System.out.println("List of Available slots :");
			Iterator itr=Car.entrySet().iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("Enter the slot number :");
			int k=sc.nextInt();
			if(Car.containsKey(k)) {
				System.out.println("RECIEPT: The slot is Succesfully booked...");
				Car.remove(k);
			}
			else {
				System.out.println("The slot is already Booked..Choose another");
			}
		}
		
	}

	}}}
