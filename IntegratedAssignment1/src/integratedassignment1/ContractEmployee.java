//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public class ContractEmployee extends Employee {
	//Implement your code here
	private double wageperHour;

	public ContractEmployee(String employeeName, double wageperHour) {
		super(employeeName);
		this.wageperHour = wageperHour;
	}
	public void calculateSalary(float hoursWorked) {
		double salary=this.wageperHour*hoursWorked;
		if(hoursWorked>190)
			return;
		else {
			salary=salary-(0.5*this.wageperHour*(190-hoursWorked));
			salary=Math.round(salary);
			super.setSalary(salary);
		}
	}

	public double getWageperHour() {
		return wageperHour;
	}

	public void setWageperHour(double wageperHour) {
		this.wageperHour = wageperHour;
	}
	
	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	/*@Override 
	public String toString() { 
	  	return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Wage Per Hour: "+getWagePerHour(); 
	}*/
}