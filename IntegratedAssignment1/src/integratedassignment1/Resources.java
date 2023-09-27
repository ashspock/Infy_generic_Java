//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public class Resources {
	//Implement your code here
	public static int getMonth(String month) {
		if(month.equals("Jan"))
			return 1;
		else if(month.equals("Feb"))
			return 2;
		else if(month.equals("Mar"))
			return 3;
		else if(month.equals("Apr"))
			return 4;
		else if(month.equals("May"))
			return 5;
		else if(month.equals("Jun"))
			return 6;
		else if(month.equals("Jul"))
			return 7;
		else if(month.equals("Aug"))
			 return 8;
		else if(month.equals("Sep"))
			return 9;
		else if(month.equals("Oct"))
			return 10;
		else if(month.equals("Nov"))
			return 11;
		else if(month.equals("Dec"))
			return 12;
		else 
			return 0;
	}
}