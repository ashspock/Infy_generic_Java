//lex_auth_012907389184704512299
//do not modify the above line

package recursionassignment5;

public class Tester {
	static int i=0;
	public static int countSubstring(String inputString, String substring, int count) {
	 	if(i==0)
	 		inputString=inputString.trim();
		if(i<inputString.length()-1){
	 		if((inputString.substring(i, substring.length()-1)).equals(substring)){
	 			count=count+1;
	 			++i;
	 		 return countSubstring(inputString,substring,count);
	 		}
	 	}
	 	return count;
	}
	   
	    public static void main(String args[]) {
	        int count = countSubstring("I felt happy because I saw the others were Happy and because I knew I should feel happy, but I was not really happy","happy", 0);
	        System.out.println(count);
	    }
}
