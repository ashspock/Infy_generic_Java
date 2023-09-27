//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public abstract class Employee {
	//Implement your code here
	private String employeeId;
	private String employeeName;
	private double salary;
	private static int contractIdCounter=10000;
	private static int permenantIdCounter=10000;
	public Employee(String employeeName) {
		this.employeeName = employeeName;
		if(this instanceof ContractEmployee)
			this.employeeId="C"+ ++contractIdCounter;
		if(this instanceof PermanentEmployee)
			this.employeeId="E"+ ++permenantIdCounter;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		String regex="[A-Z]+[a-z]*+\t*{1,}";
		if(employeeName.matches(regex))
			this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0)
			this.salary = salary;
		else
			this.salary=0;
	}
	public static int getContractIdCounter() {
		return contractIdCounter;
	}
	public static void setContractIdCounter(int contractIdCounter) {
		Employee.contractIdCounter = contractIdCounter;
	}
	public static int getPermenantIdCounter() {
		return permenantIdCounter;
	}
	public static void setPermenantIdCounter(int permenantIdCounter) {
		Employee.permenantIdCounter = permenantIdCounter;
	}
	public abstract void calculateSalary(float salaryFactor) throws Exception;
	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName();
	}
}




/*	Name Generalized Regex: 	"^[\\p{L} .'-]+$"
*/