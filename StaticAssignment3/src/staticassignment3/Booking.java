//lex_auth_012908251670077440518
//do not modify the above line

package staticassignment3;

public class Booking {
	private static int seatsAvailable;
	private String customerEmail;
	private int seatsRequired;
	private boolean isBooked;
	
	public Booking(String customerEmail, int seatsRequired)
	{
		this.customerEmail=customerEmail;
		this.seatsRequired=seatsRequired;
	}
	static
	{
		Booking.seatsAvailable=400;
	}
	public static int getSeatsAvailable()
	{
		return Booking.seatsAvailable;
	}
	public static void setSeatsAvailable(int seatsAvailable)
	{
		Booking.seatsAvailable=seatsAvailable;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getSeatsRequired() {
		return seatsRequired;
	}
	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}
	public boolean isBooked() {
	    if(this.seatsRequired<=Booking.getSeatsAvailable())
			{
				this.isBooked=true;
				Booking.seatsAvailable=Booking.seatsAvailable-this.seatsRequired;
			}
		else
			this.isBooked=false;
		return this.isBooked;
	}
	public void setBooked(boolean isBooked)
	{
		this.isBooked=isBooked;
	}

	
}
