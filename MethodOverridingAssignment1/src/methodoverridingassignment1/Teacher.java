//lex_auth_01292096468030259214
//do not modify the above line

package methodoverridingassignment1;

public class Teacher  extends Faculty{
    private String qualification;
	public Teacher(String name, float basicSalary, String qualification) {
		super(name, basicSalary);
		this.qualification = qualification;
	}
	public double calculateSalary(){
		double salary=0;
		if(this.qualification.equals("Doctoral"))
			salary=super.calculateSalary()+20000.0;
		else if(this.qualification.equals("Masters"))
			salary=super.calculateSalary()+18000.0;
		else if(this.qualification.equals("Bachelors"))
			salary=super.calculateSalary()+15500.0;
		else if(this.qualification.equals("Associate"))
			salary=super.calculateSalary()+10000.0;
		else
			salary=super.calculateSalary();
			
		return salary;
	}
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	 //Implement your code here
}
