//lex_auth_012907380954988544295
//do not modify the above line

package recursionassignment4;

public class Tester {
	  public static int[] reverseArray(int numbers[], int startIndex, int endIndex) {
		if(startIndex>=endIndex)
			return numbers;
		else{
			int t=numbers[startIndex];
			numbers[startIndex]=numbers[endIndex];
			numbers[endIndex]=t;
			return reverseArray(numbers, startIndex+1, endIndex-1);
		}
	    }
	    
	    public static void main(String args[]) {
	        int numbers[] = new int[] { 1, 2, 3, 4, 5, 6 };

	        int reversedNumbers[] = reverseArray(numbers, 0, numbers.length - 1);
	        System.out.println("Reversed array");
	        for (int number : reversedNumbers) {
	            System.out.println(number);
	        }
	    }
}
