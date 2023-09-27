//lex_auth_012907356798779392287
//do not modify the above line

package stringassignment1;

public class Tester {
	
	 public static String moveSpecialCharacters(String str){
		String w="", sp="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z')
				w=w+str.charAt(i);
			else
				sp=sp+str.charAt(i);
		}
		w=w+sp;
		 return w; 
		}
		
		public static void main(String args[]){
		    String str = "He@#$llo!*&";
		    System.out.println(moveSpecialCharacters(str));
		}

}
