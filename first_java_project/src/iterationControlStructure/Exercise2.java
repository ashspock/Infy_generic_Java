package iterationControlStructure;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(series(5,1));
		System.out.println(series(8,1));

	}
	public static int series(int n, int num)
	{
		if(n==1)
			return num;
		else{
			System.out.print(num+", ");
			return series(n-1,num*2);
		}
			
	}

}
