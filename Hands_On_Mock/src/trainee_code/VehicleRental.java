package trainee_code;

abstract public class VehicleRental {
	private Customer customer;
	private int noOfKms;
	private int journeyDays;
	
	public VehicleRental(Customer customer, int noOfKms) {
		this.customer=customer;
		this.noOfKms=noOfKms;
		this.journeyDays=0;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getJourneyDays() {
		return this.journeyDays;
	}
	
	public int identifyJourneyDays() {
		this.journeyDays = this.noOfKms/300;
		return this.noOfKms%300;
	}
	
	public abstract double calculateFinalAmount();
}
