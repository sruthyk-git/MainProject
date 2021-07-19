package PROJECT;
import java.util.Scanner;
public class Booking {
		//Array of seats
		boolean[] Seats = new boolean[11];
		Scanner sc = new Scanner(System.in);
		String name;
		public void Begin()
		{   
		while ( true )
		{
		bookSeat();
		}   
		}
		public void bookSeat()
		{
			System.out.println("NAME OF PASSENGER::");
			String NAME=sc.next();
			System.out.println("Choose Your preference Class:\n  1:  First Class \n 2: Economy Class");
		int Class = sc.nextInt();
		if ( Class == 1 )
		{
		firstClassBooking();
		}
		else
		{
		economyClassBooking();
		}
		}
		// Check and book for first class seating
		public void firstClassBooking()
		
		{	

		for ( int cnt = 1; cnt <= 5; cnt++ )
		{
		//check if seat is available to allocate to user booking.
		if ( Seats[cnt] == false )
		{
		
		Seats[cnt] = true;
		System.out.printf("First Class Seat Booking Done \n Seat Number: %d\n", cnt);
		System.out.println("Do you want to Book again for another passenger ?or Exit \nselect '1' for Yes and '2' for No\")");
		{
			int Choose = sc.nextInt();
			if ( Choose == 1 )
			{
			Begin();
			}
			else
			{
		System.out.println("Your Ticket is Confirmed...Proceed To Payment and print Ticket");
		System.out.println("Thank You For Choosing INDIGO...HAPPY JOURNEY");
		System.exit(0);
		
			}
		}
				
				break;
		}

		else if ( Seats[5] == true )
		{
		if ( Seats[10] == true)
		{
		//if both classes are fully booked
		System.out.println("Apologies!! All seats are booked. Next flight is scheduled in '3' hours.");
		}
		else
		{
		// provide passenger another available class option
		System.out.println("Sorry,First Class bookings are over. Would you like to opt for Economy class ? select '1' for Yes and '2' for No");
		int selection = sc.nextInt();
		if ( selection == 1 )
		{
		economyClassBooking();
		Begin();
		}
		else
		{
		System.out.println("Next flight is scheduled in '3' hours.");
		System.exit(0);
		}
		}
		}
		}
		}   

		// Check and book for economy class seating
		public void economyClassBooking() // assign an economy seat
		{
		for ( int cnt = 6; cnt <= 10; cnt++ )
		{
		if ( Seats[cnt] == false )
		{
		Seats[cnt] = true;
		System.out.printf("economy class seat booking is done \n Seat number: %d\n", cnt);
		System.out.printf("First Class Seat Booking Done \n Seat Number: %d\n", cnt);
		System.out.println("Do you want to Book again for another passenger ?or Exit \nselect '1' for Yes and '2' for No\")");
		{
			int Choose = sc.nextInt();
			if ( Choose == 1 )
			{
			Begin();
			}
			else
			{
		System.out.println("Your Ticket is Confirmed...Proceed To Payment and print Ticket");
		System.out.println("Thank You For Choosing INDIGO...HAPPY JOURNEY");
		System.exit(0);
			}
		}
		break;
		}
		else if ( Seats[10] == true )
		{
		if ( Seats[5] == true)
		{
		System.out.println("All seats are booked. Next flight is scheduled in 2 hours.");
		System.exit(0);
		}
		else
		{
		System.out.println("Sorry, Economy Class seat bookings are over. Would you like to opt for first Class seat? press '1' for Yes and '2' for No");
		int selection = sc.nextInt();
		if ( selection == 1 )
		{
		firstClassBooking();
		Begin();
		}
		else
		{
		System.out.println("Next flight is scheduled in 3 hours Sorry come again Later");
		System.exit(0);
		}
		}
		}
		}
		}
		
	}



