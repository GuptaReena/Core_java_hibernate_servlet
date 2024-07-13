package javabasic;

public class TwoDShape {
	
	static double PI = 3.14; //static variable
	
	int a =10; // here area is a local variable
	
	public static double computeAreaRectangle(double length,double width) {
		
		double area = length * width; //here area is a local variable
		
		return area;
	}
	
	public static double computePerimeterRectangle(double length,double width) {
		
		double area = 2*(length + width); //here area is a local variable
		
		return area;
	}
	
	public static double computeAreaCircle(double radius) {
		
		double area = PI * radius * radius;
		
		return area;
	}
	
	public static double computeAreaTriangle(double base,double height) {
		
		double area = 0.5 *base * height;
		
		return area;
	}
	public static double computePerimeterTriangle(double base,double side2, double side3) {
		
		double area = base + side2 + side3;
		
		return area;
	}
	
	public static double computePerimeterCircle(double radius) {
		
		double perimeter = 2 * PI * radius;
		
		return perimeter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
