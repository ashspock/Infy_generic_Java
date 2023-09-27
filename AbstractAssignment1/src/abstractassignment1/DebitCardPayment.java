//lex_auth_01292098291036979225
//do not modify the above line

package abstractassignment1;

public class DebitCardPayment extends Payment{
    private static int counter=1000;
	private double discountPercentage;
	public DebitCardPayment(int customerId) {
		super(customerId);
	}
	public static int getCounter() {
		return ++counter;
	}
	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public double payBill(double amount){
		if(amount <=500){
			super.serviceTaxPercentage=2.5;
			this.discountPercentage=1.0;
			return (amount*102.5*99)/10000.0;
		}
		else if(amount >500 && amount <=1000){
			super.serviceTaxPercentage=4.0;
			this.discountPercentage=2.0;
			return (amount*104*98)/10000.0;
		}
		else if(amount >1000){
			super.serviceTaxPercentage=5.0;
			this.discountPercentage=3.0;
			return (amount*105*97)/10000.0;
		}
		else{
			super.serviceTaxPercentage=0.0;
			this.discountPercentage=0.0;
			return amount;
		}
	}
    //Implement your code here
}
