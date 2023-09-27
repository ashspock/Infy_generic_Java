//lex_auth_012909119405670400530
//do not modify the above line

package arrayexercise1;

public class Tester {
	
	public static int calculateSumOfEvenNumbers(int[] numbers){
		//Implement your code here and change the return value accordingly
		int sum=0;
		for(int i: numbers){
			if(i%2==0)
			sum+=i;
		}
        return sum;
    }
    
	public static void main(String[] args) {
		int[] numbers = {68,79,86,99,23,2,41,100};
		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
	}

}
