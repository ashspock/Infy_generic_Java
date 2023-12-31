//lex_auth_01287482707103744057
//do not modify the above line

package encapsulationexercise1;

class Employee {

	private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;
    
    public String getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId=employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
    
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    
    public int getJobLevel(){
        return jobLevel;
    }
    public void setJobLevel(int jobLevel){
        this.jobLevel=jobLevel;
    }
    public int getBonus(){
        return bonus;
    }
    public void setBonus(int bonus){
    	this.bonus=bonus;
    }
    

	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
}
