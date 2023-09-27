package trainee_code;

public class Customer {
	public static String[] memberCustIdArr = {"1001P","1051R","1072P","2019R","2913R","2931P"};
	public static int[] memberBillAmountArr = {2050,5345,6896,9100,4500,3234};
	private String custId;
	private String cusName;
	public Customer(String custId, String cusName) {
		super();
		this.custId = custId;
		this.cusName = cusName;
	}
	public String getCustId() {
		return custId;
	}
	public String getCusName() {
		return cusName;
	}
	
	public float calculateDiscount(float rentalAmount) {
		float discountAmount;
		if(this.custId.charAt(custId.length()-1)=='P')
			discountAmount=(15*rentalAmount)/100;
		else if(this.custId.charAt(custId.length()-1)=='R')
			discountAmount=(10*rentalAmount)/100;
		else
			discountAmount=-1.0f;
		return discountAmount;
	}
	
	public void upgradeCustomer(float rentalAmount) {
		if(rentalAmount >= 15000) {
			int index = 0;
			for(int ind=0; ind<Customer.memberCustIdArr.length; ind++) {
				if(Customer.memberCustIdArr[ind].equals(this.custId)) {
				index = ind;
				break;
			}
		}
		this.custId = this.custId.substring(0,4)+"P";
		Customer.memberCustIdArr[index] = this.custId;
		}
	}
}
