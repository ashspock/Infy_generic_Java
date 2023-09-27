//lex_auth_012906912922468352259
//do not modify the above line

package stringassignment3;

public class Tester {

	public static String reverseEachWord(String str) {
		String w="",nstr="";
		str=str+" ";
		int i=0;
		while(i<str.length())
		{
			 while(str.charAt(i)!=' ')
			 {
				 w=str.charAt(i)+w;
				 ++i;
			 }
			 ++i;
			 nstr=nstr+w+" ";	
			 w="";
		}
		return nstr;
	}

	public static void main(String args[]) {
		String str = "Sun rises in the east";
		System.out.println(reverseEachWord(str));
	}

}
