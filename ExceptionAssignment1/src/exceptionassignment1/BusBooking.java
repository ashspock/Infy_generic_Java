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
		super();
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
	public String getDesignation() {
		return destination;
	}
	public void setDesignation(String designation) {
		this.destination = designation;
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
	public String bookTrip(String couponCode,int numberOfMembers)throws Exception{
		if(this.destination.equals("Washington DC") || this.destination.equals("Philadelphia") || this.destination.equals("Orlando") || this.destination.equals("Boston") || this.destination.equals("Atlanta"))
			if(this.tripPackage.equals("Regular")){
				this.totalAmount=numberOfMembers*500;
				return "Booking successful";
			}
			else if(this.tripPackage.equals("Premium")){
				this.totalAmount=numberOfMembers*800;
				return "Booking successful";
			}
			else
				throw new InvalidTripPackageException("Invalid Package");
		else
				throw new InvalidDestinationException("Invalid Destination");
	}
	public boolean validateCouponCode(String couponCode,int numberOfMembers) throws InvalidCouponCodeException{
		if(couponCode.equals("BIGBUS") && numberOfMembers>=10)
			return true;
		else if(couponCode.equals("MAGICBUS") && numberOfMembers>=15)
			return true;
		else
			throw new InvalidCouponCodeException("Invalid coupon code");
	}
}
