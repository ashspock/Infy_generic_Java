//lex_auth_01292096468030259214
//do not modify the above line

package methodoverridingassignment1;

public class OfficeStaff extends Faculty{
    private String designation;
	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}
    public double calculateSalary(){
		double salary=0;
		if(this.designation.equals("Accountant"))
			salary= super.calculateSalary()+10000.0;
		else if(this.designation.equals("Clerk"))
			salary=super.calculateSalary()+7000.0;
		else if(this.designation.equals("Peon"))
			salary=super.calculateSalary()+4500.0;
		else 
			salary=super.calculateSalary();
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	 //Implement your code here
}
