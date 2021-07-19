package PROJECT;
import java.util.Scanner;
public class AirlineReservationSystem {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("\n*Welcome to Indigo Airlines*...Have a Nice Day...\n");
		System.out.println("\n****************************************************");
		java.util.Date date=new java.util.Date();
		System.out.println("DATE OF BOOKING:");
		System.out.println(date);
		Destination P = new Destination();
		Booking B = new Booking();
		P.from();
		P.to();
		System.out.println("choose Departure Date...:");
		String Day = sc.next();		
		B.Begin();
		B.bookSeat();
	}
}