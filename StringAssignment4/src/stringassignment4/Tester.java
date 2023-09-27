//lex_auth_012906904764366848254
//do not modify the above line

package stringassignment4;

public class Tester {
	
	public static int findHighestOccurrence(String str){
		String v="";
		int cc=0,c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(v.indexOf(ch)!=1)
			{
				for(int j=i;j<str.length();j++)
				{
					if(ch==str.charAt(j))
						cc=cc+1;
				}
			}
			v=v+ch;
			if(cc>c)
			{
				c=cc;
				cc=0;
			}
			cc=0;
		}
		
		return c; 
	}
	
	public static void main(String args[]){
		String str = "associated";
	    System.out.println(findHighestOccurrence(str));
	}
}
