//lex_auth_012908111868043264503
//do not modify the above line

package methodoverridingexercise1;

public class User {
	// Implement your code here
	
	private int id;
	private String userName;
	private String emailId;
	private double walletBalance;
	/**
	 * @param id
	 * @param userName
	 * @param emailId
	 * @param walletBalance
	 */
	public User(int id, String userName, String emailId, double walletBalance) {
		super();
		this.id = id;
		this.userName = userName;
		this.emailId = emailId;
		this.walletBalance = walletBalance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	
	public boolean makePayment(double billAmount){
			if(billAmount<=this.walletBalance){
				this.walletBalance=this.walletBalance-billAmount;
				return true;
			}
			else 
				return false;
	}
}
