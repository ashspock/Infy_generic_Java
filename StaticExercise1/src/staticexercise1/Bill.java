//lex_auth_012908251364786176516
//do not modify the above line

package staticexercise1;

public class Bill {
	 //Implement your code here
	private static int counter;
    private String billId;
    private String paymentMode;
   
   public Bill(String paymentMode)
   {
       this.paymentMode=paymentMode;
       Bill.counter=9000;
   }
   public void setBillId(String billId)
   {
       return;
   }
   public String getBillId()
   {
       this.billId="B"+Bill.getCounter();
       return this.billId;
   }
   
   public void setPaymentMode(String paymentMode)
   {
       this.paymentMode=paymentMode;
   }
   public String getPaymentMode()
   {
       return this.paymentMode;
   }
   
   
   public static int getCounter()
   {
       Bill.counter=Bill.counter+1;
       //System.out.println(this.counter);
       return Bill.counter;
   }
}
