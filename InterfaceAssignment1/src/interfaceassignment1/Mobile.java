//lex_auth_01292151837944217650
//do not modify the above line

package interfaceassignment1;

public class Mobile {
	//Implement your code here
	 private String name;
		private String brand;
		private String operatingSystemName;
		private String operatingSystemVersion;
		public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
			super();
			this.name = name;
			this.brand = brand;
			this.operatingSystemName = operatingSystemName;
			this.operatingSystemVersion = operatingSystemVersion;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getOperatingSystemName() {
			return operatingSystemName;
		}
		public void setOperatingSystemName(String operatingSystemName) {
			this.operatingSystemName = operatingSystemName;
		}
		public String getOperatingSystemVersion() {
			return operatingSystemVersion;
		}
		public void setOperatingSystemVersion(String operatingSystemVersion) {
			this.operatingSystemVersion = operatingSystemVersion;
		}
}
