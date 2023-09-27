//lex_auth_01287442591667814426
//do not modify the above line

package finalassignment1;

public class Circle {
	//Implement your code here
	
	private final double PI=3.14;
	private double diameter;
	private double circumference;
	private double area;
	/**
	 * @param diameter
	 */
	public Circle(double diameter) {
		super();
		this.diameter = diameter;
	}
	
	public void calculateCircumference(){
		this.circumference=PI*this.diameter;
	}
	
	public void calculateArea(){
		this.area=PI*Math.pow((this.diameter)/2, 2);
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPI() {
		return PI;
	}
	
	
}
