package iterationControlStructure;

public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
		System.out.println(fact(7));
	}
	public static int fact(int n){
		if(n==0){
			return (1);
		}
		else 
			return n* fact(n-1);
	}
	

}
