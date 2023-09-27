//lex_auth_01292098291036979225
//do not modify the above line

package abstractassignment1;

public class CreditCardPayment extends Payment {
    private static int counter=1000;
	public CreditCardPayment(int customerId) {
		super(customerId);
		// TODO Auto-generated constructor stub
	}
	public static int getCounter() {
		return ++counter;
	}
	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}
	public double payBill(double amount){
		if(amount <=500){
			super.serviceTaxPercentage=3.0;
			return (amount*103)/100.0;
		}
		else if(amount >500 && amount <=1000){
			super.serviceTaxPercentage=5.0;
			return (amount*105)/100.0;
		}
		else if(amount >1000){
			super.serviceTaxPercentage=6.0;
			return (amount*106)/100.0;
		}
		else{
			super.serviceTaxPercentage=0.0;
			return amount;
		}
	}
	
    
}
