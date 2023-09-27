//lex_auth_012906905893519360253
//do not modify the above line

package stringassignment2;

public class Tester {

	public static boolean checkPalindrome(String str) {
		String w="";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			w=w+str.charAt(len-i-1);
		}
		if(w.equals(str))
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		String str = "radar";
		if (checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}

}
