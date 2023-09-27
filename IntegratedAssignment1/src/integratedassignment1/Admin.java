//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public class Admin extends Employee{
	
	//Implement your code here
	int i=0;
	public void generateSalarySlip(Employee[] employees, float[] salaryFactor) throws Exception {
		for(Employee e:employees) {
			calculateSalary(salaryFactor[i]);
			i++;
		}
	}
	public int generateAssetsReport(Employee[] employees, String lastDate) {
		
	}
	public String[] generateAssetsReport(Employee[] employees, char assetCategory) {
		
	}
}