//lex_auth_012880454683738112345
//do not modify the above line

package abstractexercise1;

public abstract class Student {
	//Implement your code here
	private String studentName;
	private int[] testScores;
	private String testResult;
	public Student(String studentName) {
		if(this instanceof UndergraduateStudent){
			this.studentName = studentName;
		}
		if(this instanceof GraduateStudent){
			this.studentName = studentName;
		}
	}

	public abstract void generateResult();
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int[] getTestScores() {
		return testScores;
	}
	public void setTestScores(int testNumber, int testScore) {
		this.testScores[testNumber] = testScore;
	}
	public String getTestResult() {
		return testResult;
	}
	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	
	
}
