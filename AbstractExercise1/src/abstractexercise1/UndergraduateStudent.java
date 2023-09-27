//lex_auth_012880454683738112345
//do not modify the above line

package abstractexercise1;

public class UndergraduateStudent extends Student{
	public UndergraduateStudent(String studentName){
		super(studentName);
		super.getTestScores();
	}
	
	@Override
	public void generateResult(){
		int avg=0;
		int c=0;
		for(int i:super.getTestScores()){
			avg=avg+i;
			c+=1;
		}
		avg=avg/c;
		if(avg>=60)
			super.setTestResult("Pass");
		else
			super.setTestResult("Fail");
	}
}
