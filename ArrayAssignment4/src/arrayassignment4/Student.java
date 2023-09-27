//lex_auth_012909127698530304533
//do not modify the above line

package arrayassignment4;

public class Student {
	//Implement your code here
	private int[] marks;
	private char[] grade;
	
	public Student(int[] marks){
		this.marks=marks;
		this.grade=new char[marks.length];
	}
	
	public int[] getMarks(){
		return this.marks;
	}
	public void setMarks(int[] marks){
		this.marks=marks;
	}
	
	public char[] getGrade(){
		return this.grade;
	}
	public void setGrade(char[] grade){
		this.grade=grade;
	}
	
	public void findGrade(){
		int p=0;
		for(int i:marks){
			if(i>=92)
				this.grade[p]='E';
			if(i>=85 && i<92)
				this.grade[p]='A';
			if(i>=70 && i<85)
				this.grade[p]='B';
			if(i>=65 && i<70)
				this.grade[p]='C';
			if(i<65)
				this.grade[p]='D';
			++p;
		}
	}
	
}
