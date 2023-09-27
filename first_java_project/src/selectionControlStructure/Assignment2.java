package selectionControlStructure;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		roots(1,4,4);
		roots(1,4,6);
	}
	public static void roots(int a,int b,int c){
		int d=(b*b)-(4*a*c);
		if(d<0){
			System.out.println("The equation has no real roots");
			return;
		}
		if(d==0){
			double x=((-b)/(2*a));
			System.out.println("The root is "+x);
		}
		if(d>0){
			double x1=(-b+d)/(2*a);
			double x2=(-b-d)/(2*a);
			System.out.println("The roots are "+x1+" and "+x2);
		}
	}

}
