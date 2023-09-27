//lex_auth_012921592276475904109
//do not modify the above line

package exceptionassignment1;

public class BusBooking {
    //Implement your code here
	private int bookingId;
	private String destination;
	private String tripPackage;
	private double totalAmount;
	public BusBooking(int bookingId, String destination, String tripPackage) {
		this.bookingId = bookingId;
		this.destination = destination;
		this.tripPackage = tripPackage;
		this.totalAmount=0;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTripPackage() {
		return tripPackage;
	}
	public void setTripPackage(String tripPackage) {
		this.tripPackage = tripPackage;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String bookTrip(String couponCode, int numberOfMember)throws Exception {
		
		try {
			/*if((this.destination.equals("Washington DC")) || (this.destination.equals("Philadelphia")) || 
					(this.destination.equals("Orlando")) || (this.destination.equals("Boston")) || (this.destination.equals("Atlanta"))) */
			if((this.destination!=("Washington DC")) && (this.destination!=("Philadelphia")) &&
					(this.destination!=("Orlando")) && (this.destination!=("Boston")) && (this.destination!=("Atlanta")))	
				throw new InvalidDestinationException("Invalid destination");
		}
		catch(InvalidDestinationException e) {
			System.out.println(e.getMessage());
		}
		
		try {
				if((this.tripPackage!=("Regular")) && (this.tripPackage!=("Premium")))
					throw new InvalidTripPackageException("Invalid package");
		}
		catch(InvalidTripPackageException e) {
			System.out.println(e.getMessage());
		}
		
		try {	
			    if(validateCouponCode(couponCode, numberOfMember)) {
			    	if(this.tripPackage.equals("Regular"))
			    		this.totalAmount=numberOfMember*500;
			    	if(this.tripPackage.equals("Premium"))
			    		this.totalAmount=numberOfMember*800;
			    }
				
		}
		catch(InvalidCouponCodeException e) {
			System.out.println(e.getMessage());
		}
			if(this.totalAmount>0)
				return "Booking successful";
			else
				return  "";
		
	}
	public boolean validateCouponCode(String couponCode, int numberOfMembers)throws Exception {
		//try{
			if(couponCode.equals("BIGBUS") && numberOfMembers>=10)
				return true;
			else if(couponCode.equals("MAGICBUS") && numberOfMembers>=15)
				return true;
			else { 
				throw new InvalidCouponCodeException("Invalid coupon code.");
			}
			
			//}
		/*catch(InvalidCouponCodeException e) {
			System.out.println(e.getMessage());
		}*/
		
	}
}
