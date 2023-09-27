//lex_auth_012909487205638144539
//do not modify the above line

package arrayassignment5;

public class Tester {
	
	public static int[] findNumbers(int num1, int num2) {
		int[] numbers=new int[6];
		if(num1>0 && num2>0)
		{
			if(num2-num1>0)
			{
				int k=0;
				{
					for(int i=num1;i<=num2;i++)
					{
						if(i%5==0 && i<100)
						{
							if(sumOfDigits(i)%3==0)
							{
								if(k<=5)
								{
									numbers[k]=i;
									++k;
								}
								else
								    return numbers;
							}
						}
					}
				}
			}
			
		}
		return numbers;
	}
	
	public static int sumOfDigits(int n){
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum+=d;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num1 = -10;
		int num2 = 29;
      	int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}
