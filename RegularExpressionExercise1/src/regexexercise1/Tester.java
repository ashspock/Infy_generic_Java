//lex_auth_012876934755098624282
//do not modify the above line

package regexexercise1;

public class Tester {
	 public static boolean checkNameValidity(String name) {
		//Implement your code here and change the return value accordingly
		 String regex1="[A-Z]{1}[a-z]{1,14}+[\\s]+[A-Z]{1}[a-z]{1,14}";
		 String regex2="[A-Z]{1}[a-z]+[\\s]{1}+[A-Z]{1}[a-z]";
		 String regex3="[A-Z]{2}";
		 String regex4="[A-Z][a-z]{1,19}";
		 if(name.matches(regex1) || name.matches(regex2) || name.matches(regex3) || name.matches(regex4))
			 return true;
		return false; 
	    }
	    
	    public static void main(String[] args) {
	        
	        //Change the value of name for testing your code with different names
	        String name = "Sir Alexander";
	        System.out.println("The name is "+ (checkNameValidity(name) ? "valid!" : "invalid!"));      
	    }
}
