//lex_auth_01291666846849433675
//do not modify the above line

package finalexercise1;

public class Student {
	//Implement your code here
	private final int STIPEND=100;
	private int studentId;
	private int aggregateMarks;
	public double calculateTotalStipend(){
		double st=0;
		if(this.aggregateMarks>=85 && this.aggregateMarks<90)
			st=((STIPEND+10)*100)/100.0;
		else if(this.aggregateMarks>=90 && this.aggregateMarks<95)
			st=((STIPEND+15)*100)/100.0;
		else if(this.aggregateMarks>=95 && this.aggregateMarks<=100)
			st=((STIPEND+20)*100)/100.0;
		else 
			st=STIPEND+0;
		return st;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAggregateMarks() {
		return aggregateMarks;
	}
	public void setAggregateMarks(int aggregateMarks) {
		this.aggregateMarks = aggregateMarks;
	}
	public int getSTIPEND() {
		return STIPEND;
	}
	
	
}
