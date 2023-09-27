//lex_auth_012877025318608896373
//do not modify the above line

package methodoverloadingassignment2;

//import methodoverloadingexercise1.Point;

public class Point {
	
	//Reuse the code of Method Overloading - Exercise 1 
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
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "Point\nxCoordinate: "+this.getxCoordinate()+"\nyCoordinate: "+this.getyCoordinate();
    }
    

}
