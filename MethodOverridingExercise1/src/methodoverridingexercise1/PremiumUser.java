//lex_auth_012908111868043264503
//do not modify the above line

package methodoverridingexercise1;

public class PremiumUser extends User{
	// Implement your code here
	
	private int rewardPoints;
	/**
	 * @param id
	 * @param userName
	 * @param emailId
	 * @param walletBalance
	 */
	public PremiumUser(int id, String userName, String emailId, double walletBalance) {
		super(id, userName, emailId, walletBalance);
		this.rewardPoints=0;
	}

	public boolean makePayment(double billAmount){
		if(super.makePayment(billAmount)){
			setRewardPoints(this.rewardPoints+(int)(((int)billAmount)*10)/100);
			return true;
		}
		else
			return false;
		
	}
	
	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
}
