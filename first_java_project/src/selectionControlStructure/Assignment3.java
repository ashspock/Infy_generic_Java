package selectionControlStructure;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiply(1,5,3));
		System.out.println(multiply(3,7,8));
		System.out.println(multiply(7,2,9));
		System.out.println(multiply(2,6,7));
	}
	public static int multiply(int a,int b,int c){
		if(a==7 || b==7 || c==7){
			if(a==7)
				return(b*c);
			else if(b==7)
				return(c);
			else
				return -1;
		}
		else 
			return a*b*c;
	}

}
