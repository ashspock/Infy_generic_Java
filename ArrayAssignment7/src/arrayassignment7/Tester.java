//lex_auth_012907362013306880288
//do not modify the above line

package arrayassignment7;

public class Tester {
	public static int b=0;
	public static String[] findPermutations(String str)
	{
		int numberOfPermutations=fact(str.length(),1);
        String w[]=new String[numberOfPermutations];
		generatePermutation(w,str,0,str.length());
		for(int s=0;s<w.length-1;s++)
		{
		    for(int m=s + 1;m<w.length;m++)
		    {
		    	if(w[s] != null && w[s].equals(w[m]))
		        {
		    		w[m] = null;
		        }
		    } 
		}
		
        return w;
    }
	
	public static int fact(int len, int f)
	{
		if(len!=0)
			return fact(len-1,f*len);
		else
			return f;
	}
	
	public static void generatePermutation(String w[], String str, int start, int end)  
    {  
        if (start == end-1)
        {
        	w[b]=str;
        	++b;
        	return;
        }  
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                str = swapString(str,start,i);  
                generatePermutation(w,str,start+1,end);  
                str = swapString(str,start,i);  
            }  
        }  
    }
	
	public static String swapString(String a, int i, int j) 
	{  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }
    
    public static void main(String args[]){
        String str = "abc";
        String permutations[] = findPermutations(str);
        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }
    }

}
