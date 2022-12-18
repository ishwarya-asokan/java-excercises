package busReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String passangerName;
	int busNo;
	Date date;

Booking(){
	Scanner scanner=new Scanner(System.in);  /// mostly initlize only do, but here we ask input to store
	System.out.println("Enter name of passenger");
	passangerName = scanner.nextLine();
	System.out.println("Enter the bus numxtber");
	busNo=scanner.nextInt();
	System.out.println("Enter the date in te format of DD-MM-YYYY");	
	String dateInput=scanner.next();
	SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");	//min=mm
	try {
		date = dateFormat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
				// be careful in handling in object a reference address because it allows change data
		int capacity = 0;
		for(Bus bus:buses) { //INVOKE - BOOKING, PASS -BOOKINGS bUS 
			if(bus.getBusNo()==busNo)
				capacity=bus.getCapacity();
		}
		int booked=0;
		for(Booking b:bookings) {
			if(b.busNo==busNo && b.date.equals(date)) {
				booked++;
			}
		}
			
		return booked<capacity?true:false;
	}
}


	
	
	


