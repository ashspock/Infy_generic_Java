//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public class Asset {
	//Implement your code here
	private String assetId;
	private String assetName;
	private String assetExpiry;
	public Asset(String assetId, String assetName, String assetExpiry) {
		//super();
		this.assetId = assetId;
		this.assetName = assetName;
		this.assetExpiry = assetExpiry;
	}
	public String getAssetId() {
		return assetId;
	}
	public void setAssetId(String assetId) {
		String regex="[DSK|LTP|IPH]{3}+[-]{1}+[0-9]{6}+[L|H]";
		if(assetId.matches(regex))
			this.assetId = assetId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getAssetExpiry() {
		return assetExpiry;
	}
	public void setAssetExpiry(String assetExpiry) {
		this.assetExpiry = assetExpiry;
	}
	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	@Override
	public String toString() {
		return "Asset Id: "+getAssetId()+", Asset Name: "+getAssetName()+", Asset Expiry: "+getAssetExpiry();
	}
}