/*Write a Java program to create a class called "Circle" 
 * with a radius attribute.You can access and modify this attribute. 
 * Calculate the area and circumference of the circle.*/

package practiceOops;

class Circle{
	double radius;
	
	public Circle(double radius) {
		
		this.radius =  radius;
	}
	
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		
		return (Math.PI*radius*radius);
	}
	
	public double getCumference() {
		
		return 2*Math.PI*radius;
	}
	
}

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r =5;
		Circle c1 =  new Circle(r);
		System.out.println("\nRadius of the circle is " + r);
		System.out.println("Area of a circle is : " + c1.getArea());
		System.out.println("Circumference of a circle is : " + c1.getCumference());
		
		 r =8;
		c1.setRadius(r);
		System.out.println("\nRadius of the circle is " + r);
		System.out.println("Area of a circle is : " + c1.getArea());
		System.out.println("Circumference of a circle is : " + c1.getCumference());
		
		
		
		

	}

}
