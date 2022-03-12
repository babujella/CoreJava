package sportscomplex;
import java.security.KeyStore.Entry;
import java.util.*;
public class SportsComplex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean b=true;
		HashMap<Integer,String> badmintonSlots=new HashMap<>();{
			badmintonSlots.put(1, "10:00 - 11:00");
			badmintonSlots.put(2," 11:00 - 12:00");
			badmintonSlots.put(3, "12:00 - 13:00");
			badmintonSlots.put(4, "13:00 - 14:00");
			badmintonSlots.put(5, "14:00 - 15:00");
			badmintonSlots.put(6, "15:00 - 16:00");
			badmintonSlots.put(7, "16:00 - 17:00");
			badmintonSlots.put(8, "17:00 - 18:00");
			badmintonSlots.put(9, "18:00 - 19:00");
			badmintonSlots.put(10, "19:00 - 20:00");
			}
		HashMap<Integer,String> FootBall=new HashMap<>() ;{
			FootBall.put(1, "9:00-9:30");
			FootBall.put(2, "9:30-10:00");
			FootBall.put(3, "10:00-10:30");
			FootBall.put(4, "10:30-11:00");
			FootBall.put(5, "11:00-11:30");
			FootBall.put(6, "11:30-12:00");
			FootBall.put(7, "12:00-12:30");
			FootBall.put(8, "12:30-1:00");
			FootBall.put(9, "1:00-1:30");
			FootBall.put(10, "1:30-2:00");
			FootBall.put(11, "2:00-2:30");
			FootBall.put(12, "2:30-3:00");
			FootBall.put(13, "3:00-3:30");
			FootBall.put(14, "3:30-4:00");
			FootBall.put(15, "4:00-4:30");
			FootBall.put(16, "4:30-5:00");
			FootBall.put(17, "5:00-5:30");
			FootBall.put(18, "5:30-6:00");
			FootBall.put(19, "6:00-6:30");
			FootBall.put(20, "6:30-7:00");
		}
		HashMap<Integer,String> BoxCricket=new HashMap<>() ;{
			BoxCricket.put(1, "1:00-3:00");
			BoxCricket.put(2, "3:00-5:00");
			BoxCricket.put(3, "5:00-7:00");
			BoxCricket.put(4, "7:00-9:00");
			BoxCricket.put(5, "9:00-11:00");
		}
		while(b) {		
			System.out.println("Enter the name plz :");
			String name=sc.next();
			System.out.println("Total List of sports : 1.Badminton court"
				+ "2.Football court"
				+ "3.Box Cricket");
			int n=sc.nextInt();
			if(n==1) {
				System.out.println("Badminton sport:");
			System.out.println("List of slot and timings :");
			Iterator itr=badmintonSlots.entrySet().iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}	
			System.out.println("Enter the slot  :");
			int j=sc.nextInt();
			if(badmintonSlots.containsKey(j)) {
				
				System.out.println("The slot is Booked :");
				badmintonSlots.remove(j);
			}
			else {
				System.out.println("The slot is already booked");
			}
			
		
		}
			if(n==2) {
				System.out.println("FootBall sport :");
				System.out.println("Total List of slot and timings :");
				Iterator itr=FootBall.entrySet().iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}	
				System.out.println("Enter the slot  :");
				int k=sc.nextInt();
				if(k>20) {
					System.out.println("invalid");
				}
				if(FootBall.containsKey(k)) {
					
					System.out.println("The slot is Booked :");
					FootBall.remove(k);
				}
				 else  {
					System.out.println("The slot is already booked");
				}
				}
			if(n==3) {
				System.out.println("Cricket Box sport :");
				System.out.println("Total List of slot and timings :");
				Iterator itr=BoxCricket.entrySet().iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}	
				System.out.println("Enter the slot  :");
				int k=sc.nextInt();
				if(BoxCricket.containsKey(k)) {
					
					System.out.println("The slot is Booked :");
					BoxCricket.remove(k);
				}
				else {
					System.out.println("The slot is already booked");
				}
				}	
			
	}
	}}
	
	

	
