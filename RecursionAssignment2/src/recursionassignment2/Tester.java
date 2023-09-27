//lex_auth_012907414165159936311
//do not modify the above line

package recursionassignment2;

public class Tester {
	static double sum=0;
	//static int c=1;
	public static double findHPSum(int num) {
		if(num==0)
			return sum;
		else{
				sum=sum+(double)1/num;
				return findHPSum(num-1);
			}
	}
	    
	    public static void main(String args[]) {
	        System.out.println(findHPSum(2));
	    }
}
