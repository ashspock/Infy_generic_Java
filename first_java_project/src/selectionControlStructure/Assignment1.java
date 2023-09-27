package selectionControlStructure;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(6,5));
		System.out.println(sum(5,5));
	}
	public static int sum(int a, int b){
		if(a==b)
			return a+b;
		else
			return (2*(a+b));
	}

}
