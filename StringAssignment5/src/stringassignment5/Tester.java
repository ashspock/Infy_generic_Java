//lex_auth_012906913553276928258
//do not modify the above line

package stringassignment5;

public class Tester {

	public static String removeDuplicatesandSpaces(String str) {
		// Implement your code here and change the return value accordingly
		str=str.replaceAll("\\s","");
		String v="";
		for(int i=0;i<str.length();i++)
		{
			if(v.indexOf(str.charAt(i))==-1)
			{
				v=v+str.charAt(i);
			}
		}
		return v;
	}

	public static void main(String args[]) {
		String str = "object oriented programming";
		System.out.println(removeDuplicatesandSpaces(str));
	}

}
