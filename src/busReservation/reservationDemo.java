package busReservation;
import java.util.ArrayList;
import java.util.Scanner;

public class reservationDemo {                   // int val[]=new int val[6]; integer array
public static void main(String args[]) {        // Bus buses[]=new Bus[50]; class object not effective array
	ArrayList<Bus> buses = new ArrayList<Bus>();
	ArrayList<Booking> bookings = new ArrayList<Booking>();
	                                                                          //ArrayList<Integer> nums= new ArrayList<integer>();
	buses.add(new Bus(1,true,45));      //45 & 50 are limits of capacity      //array list collection//no limit  number of object
	buses.add(new Bus(2,false,50));                                            //array list collection//no limit  number of object
	buses.add(new Bus(3,true,45));                                            //array list collection//no limit  number of object

	String userIp = "y";
	Scanner scanner = new Scanner(System.in);
	
	for(Bus b:buses) {            //for(int i:arr)

	b.displayinfo();
	}                          	
	
	
	while(userIp.equals("y") ){
		System.out.println("welome to bus Reservation: Enter y is for booking and n is for Exit");	
		userIp = scanner.nextLine();

		if(userIp.equals("y")) { // not supported == in geting input string  .equal("y")

		Booking booking =new Booking();
		if(booking.isAvailable(bookings,buses)) {
		bookings.add(booking);
			System.out.println("Your booking confirmed");
		}
		else
			System.out.println("sorry bus is Full. Try another bus or date");
			
		
	}
	}
}
}
	
	
	
	
