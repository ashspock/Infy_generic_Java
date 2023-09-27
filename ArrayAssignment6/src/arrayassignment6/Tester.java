//lex_auth_012909484022734848537
//do not modify the above line

package arrayassignment6;

public class Tester {
	
	public static int findTotalCount(int[] numbers) {
		int k=0;
		for(int i=0;i<numbers.length-1;i++){
			if(numbers[i]==numbers[i+1]){
					++k;
				}
			}
		return k;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 5, 100, -20, 6, 0, 0 };
		System.out.println("Count of adjacent occurrence: "+findTotalCount(numbers));
	}

}
