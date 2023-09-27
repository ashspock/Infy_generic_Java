//lex_auth_012907433000075264323
//do not modify the above line

package associationexercise1;

public class CabServiceProvider {
	private String cabServiceName;
	private int totalCabs;
	public CabServiceProvider(String cabServiceName, int totalCabs) {
		super();
		this.cabServiceName = cabServiceName;
		this.totalCabs = totalCabs;
	}
	public String getCabServiceName() {
		return cabServiceName;
	}
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}
	public int getTotalCabs() {
		return totalCabs;
	}
	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}
	public double calculateRewardPrice(Driver driver) {
		if(driver.getAverageRating()<4)
			return 0;
		else {
			if(this.cabServiceName.equals("Halo")) {
				if(driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5)
					return ((10*driver.getAverageRating())*10)/10.0;
				else if(driver.getAverageRating() >= 4 && driver.getAverageRating() <= 4.5)
					return ((5*driver.getAverageRating())*10)/10.0;
				else
					return 0;
			}
			else if(this.cabServiceName.equals("Aber")) {
				if(driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5)
					return ((800*driver.getAverageRating()))/100.0;
				else if(driver.getAverageRating() >= 4 && driver.getAverageRating() <= 4.5)
					return ((300*driver.getAverageRating()))/100.0;
				else
					return 0;
			}
			else
				return 0;
		}
	}
}
