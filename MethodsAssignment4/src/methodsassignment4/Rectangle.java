//lex_auth_012890553012772864110
//do not modify the above line

package methodsassignment4;

public class Rectangle {
	//Implement your code here
	public float length;
	public float width;
	
	public double calculateArea(){
		double area=Math.round((length*width)*100)/100.0;
		return area;
	}
	public double calculatePerimeter(){
		double perimeter=Math.round(2*(length+width)*100)/100.0;
		return perimeter;
	}
	
}
