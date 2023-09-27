//lex_auth_01292151837944217650
//do not modify the above line

package interfaceassignment1;

public class SmartPhone  extends Mobile implements Testable{
    //Implement your code here
    private String networkGeneration;

	public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion,
			String networkGeneration) {
		super(name, brand, operatingSystemName, operatingSystemVersion);
		this.networkGeneration = networkGeneration;
	}

	public String getNetworkGeneration() {
		return networkGeneration;
	}

	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}
	public boolean testCompatibility(){
		if(super.getOperatingSystemName().equals("Saturn"))
		{
			if(this.networkGeneration.equals("3G"))
			{
				if(super.getOperatingSystemVersion().equals("1.1") || super.getOperatingSystemVersion().equals("1.2") || super.getOperatingSystemVersion().equals("1.3"))
					return true;
			}
			else if(this.networkGeneration.equals("4G"))
			{
				if(super.getOperatingSystemVersion().equals("1.2") || super.getOperatingSystemVersion().equals("1.3"))
					return true;
			}
			else if(this.networkGeneration.equals("5G"))
			{
				if(super.getOperatingSystemVersion().equals("1.3"))
					return true;
			}
		}
		if(super.getOperatingSystemName().equals("Gara"))
		{
			if(this.networkGeneration.equals("3G"))
			{
				if(super.getOperatingSystemVersion().equals("EXRT.1") || super.getOperatingSystemVersion().equals("EXRT.2") || super.getOperatingSystemVersion().equals("EXRU.1"))
					return true;
			}
			else if(this.networkGeneration.equals("4G"))
			{
				if(super.getOperatingSystemVersion().equals("EXRT.2") || super.getOperatingSystemVersion().equals("EXRU.2"))
					return true;
			}
			else if(this.networkGeneration.equals("5G"))
			{
				if(super.getOperatingSystemVersion().equals("EXRU.2"))
						return true;
			}
		}
		return false;
	} 
	//Implement your code here
}
