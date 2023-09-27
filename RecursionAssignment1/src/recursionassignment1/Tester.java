//lex_auth_012907378628927488293
//do not modify the above line

package recursionassignment1;

public class Tester {
	static int a=-1;
	static int b=1;
	static int sum=0;
	  public static int findFibonacci(int n) {
		//Implement your code here and change the return value accordingly
		  if(n==0)
			  return sum;
		  else{
			  sum=a+b;
			  a=b;
			  b=sum;
			  return findFibonacci(n-1);
		  } 
	    }

	    public static void main(String args[]) {
	        int n = 35;
	        if(n!=0)
	            System.out.println(findFibonacci(n));
	        else
	            System.out.println("Please enter a valid value for n");
	    }
}
