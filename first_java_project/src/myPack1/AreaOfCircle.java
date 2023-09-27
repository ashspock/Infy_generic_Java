package myPack1;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(circleArea(4));
		System.out.println(circleArea(10));
	}
	public static double circleArea(int radius)
	{
	    double area=(3.14*radius*radius);
	    return area;
	}

}
