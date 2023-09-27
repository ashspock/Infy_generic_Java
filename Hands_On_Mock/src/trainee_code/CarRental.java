package trainee_code;

public class CarRental extends VehicleRental {
	private String carType;

	public CarRental(Customer customer,int noOfKms,  String carType) {
		super(customer, noOfKms);
		this.carType = carType;
	}
	public double calculateFinalAmount() {
		double finalAmount;
		int rentPerDay = CarDetails.identifyPerDayRent(this.carType);//static function hence class name used to call
		//super.identifyJourneyDays();
		int excessKms = super.identifyJourneyDays();
		if(rentPerDay==-1 || excessKms<0 || super.getJourneyDays()<0)
			finalAmount=-1;
		else {
			float rentalAmount = super.getJourneyDays()*rentPerDay;
			int excessKmsAmount = excessKms*12;
			rentalAmount+=excessKmsAmount;
			float discountAmount=super.getCustomer().calculateDiscount(rentalAmount);
			if(discountAmount==-1)
				finalAmount=-1;
			else {
				finalAmount=rentalAmount-discountAmount;
				for(int i=0; i<Customer.memberCustIdArr.length; i++)
					if(Customer.memberCustIdArr[i].equals(getCustomer().getCustId()))
						Customer.memberBillAmountArr[i] += finalAmount;
			}
		}
		return finalAmount;
	}
	
}
