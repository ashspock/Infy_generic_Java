//lex_auth_012877018630356992365
//do not modify the above line

package methodoverloadingexercise1;

public class Point {
    //Implement your code here
	
	private double xCoordinate;
	private double yCoordinate;
	
	public Point(double xCoordinate, double yCoordinate) {
		super();
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	public double calculateDistance(){
		
		return Math.round(Math.sqrt(Math.pow(this.xCoordinate,2)+Math.pow(yCoordinate,2))*100)/100.0;
	}
	
	public double calculateDistance(Point point){
		
		return Math.round(Math.sqrt(Math.pow(this.xCoordinate-point.xCoordinate,2)+Math.pow(this.yCoordinate-point.yCoordinate,2))*100)/100.0;
	
	}
	
	
	
	
}
