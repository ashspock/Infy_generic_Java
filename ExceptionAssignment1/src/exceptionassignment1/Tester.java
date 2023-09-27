//lex_auth_012921592276475904109
//do not modify the above line

package exceptionassignment1;

public class Tester {
	public static void main(String[] args)throws Exception{
		BusBooking booking = new BusBooking(101,"Benedict", "exclsuive");
		String result = booking.bookTrip("SMALLBUS", 11);
		//System.out.println(result);
		if(result.equals("Booking successful")){
			System.out.println(result);
			System.out.println("Total amount for the trip: " + booking.getTotalAmount());
		}
		else{
			System.out.println(result);
			System.out.println("Your booking was not successful, please try again!");
		}
	}
}
