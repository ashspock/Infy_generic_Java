//lex_auth_012877025318608896373
//do not modify the above line

package methodoverloadingassignment2;

public class Triangle {
	//Implement your code here
	
	private Point point1;
	private Point point2;
	private Point point3;
	
	public Triangle(){
		this.point1=new Point(0,0);
		this.point2=new Point(1,1);
		this.point3=new Point(2,5);
	}
	
	public Triangle(double point1XCoordinate, double point1YCoordinate, double point2XCoordinate, double point2YCoordinate, double point3XCoordinate, double point3YCoordinate){
		this.point1=new Point(point1XCoordinate,point1YCoordinate);
		this.point2=new Point(point2XCoordinate,point2YCoordinate);
		this.point3=new Point(point3XCoordinate,point3YCoordinate);
	}

	public Triangle(Point point1, Point point2, Point point3) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	
	public double calculateArea(){
		double ab=point1.calculateDistance(point2);
		double bc=point2.calculateDistance(point3);
		double ca=point3.calculateDistance(point1);
		double s=(ab+bc+ca)/2;
		
		return Math.round((Math.sqrt(s*(s-ab)*(s-bc)*(s-ca)))*100)/100.0;
	}
	public double calculatePerimeter(){
		double ab=point1.calculateDistance(point2);
		double bc=point2.calculateDistance(point3);
		double ca=point3.calculateDistance(point1);
		
		return Math.round((ab+bc+ca)*100)/100.0;
	
	}
}
