//lex_auth_01292096468030259214
//do not modify the above line

package methodoverridingassignment1;

public class Faculty {
	 //Implement your code here
	 private String name;
		private float basicSalary;
		private float bonusPercentage;
		private float carAllowancePercentage;
		
		public Faculty(String name, float basicSalary) {
			super();
			this.name = name;
			this.basicSalary = basicSalary;
			this.bonusPercentage=4.0f;
			this.carAllowancePercentage=2.5f;
		}
		
		public double calculateSalary(){
			return (this.basicSalary*(1+this.bonusPercentage/100.0f+this.carAllowancePercentage/100.0f));
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getBasicSalary() {
			return basicSalary;
		}
		public void setBasicSalary(float basicSalary) {
			this.basicSalary = basicSalary;
		}
		public float getBonusPercentage() {
			return bonusPercentage;
		}
		public void setBonusPercentage(float bonusPercentage) {
			this.bonusPercentage = bonusPercentage;
		}
		public float getCarAllowancePercentage() {
			return carAllowancePercentage;
		}
		public void setCarAllowancePercentage(float carAllowancePercentage) {
			this.carAllowancePercentage = carAllowancePercentage;
		}
}
