package practiceOops;

class Rectangle{
	
	private  double width;
	
	private double height;
	
	public Rectangle(double width, double height) {
		
		this.width =  width;
		this.height =  height;
		
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double  area() {
		return (width*height);
				
	}
	
	public double perimeter() {
		
		return 2*(width+height);
	}
	
	
	
}

public class ClaculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1 =  new Rectangle(20,40);
		r1.area();
		r1.perimeter();
		
		System.out.println("Area of a rectangle is : " + r1.area());
		System.out.println("Perimeter of a rectangle is : " + r1.perimeter());
		
		
		System.out.println("--------------------------------------");
		
		//System.out.println("We set a new value of a rectangle");
		
		r1.setWidth(6);
		r1.setHeight(12);
	
		System.out.println("Area of a rectangle is : " + r1.area());
		System.out.println("Perimeter of a rectangle is : " + r1.perimeter());
		
		
	}

}
