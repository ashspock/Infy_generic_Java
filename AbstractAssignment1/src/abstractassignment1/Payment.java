//lex_auth_01292098291036979225
//do not modify the above line

package abstractassignment1;

public abstract class Payment {
    //Implement your code here
	private int customerId;
    protected String paymentId;
    protected double serviceTaxPercentage;
	public Payment(int customerId) {
		if(this instanceof DebitCardPayment)
			this.paymentId="D"+DebitCardPayment.getCounter();
		if(this instanceof CreditCardPayment)
			this.paymentId="C"+CreditCardPayment.getCounter();
		this.customerId = customerId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public double getServiceTaxPercentage() {
		return serviceTaxPercentage;
	}
	public void setServiceTaxPercentage(double serviceTaxPercentage) {
		this.serviceTaxPercentage = serviceTaxPercentage;
	}
    public abstract double payBill(double amount);
}
