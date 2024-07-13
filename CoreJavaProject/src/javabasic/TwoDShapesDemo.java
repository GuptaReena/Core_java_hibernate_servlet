package javabasic;

import java.util.Scanner;

public class TwoDShapesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=  new Scanner(System.in);
		
		char answer = 'y';
		
		do {
		
		System.out.println("************************");
		System.out.println("2D SHAPES");
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		System.out.println("3. Triangle");
		System.out.println("************************");
		System.out.println("Please Choose an Option");
		int option = sc.nextInt();
		System.out.println("************************");
		
		switch(option) {
		case 1:
			System.out.println("You have selected Rectangle...");
			System.out.println("Enter Length: ");
			double length = sc.nextDouble();
		
			System.out.println("Enter width: ");
			double width = sc.nextDouble();
			
			double areaAnswer = TwoDShape.computeAreaRectangle(length, width);
			double perimeterAnswer = TwoDShape.computePerimeterRectangle(length, width);
			
			System.out.println("Area of rectangle with length "+ length + " width "+ width + " is " + areaAnswer + " sq. units");
			System.out.println("Perimeter of rectangle with length "+ length + " width "+ width + " is " + areaAnswer + " sq. units");
			
			break;
			
			
		case 2:
			System.out.println("You have selected Rectangle...");
			System.out.println("Enter radius: ");
			double radius = sc.nextDouble();
			
			double areaAnswerCircle = TwoDShape.computeAreaCircle(radius);
			double perimeterAnswerCircle = TwoDShape.computePerimeterCircle(radius);
			
			System.out.println("Area of circle with radius "+ radius + " is " + areaAnswerCircle + " units");
			System.out.println("Perimeter of circle with radius "+ radius + " is " + perimeterAnswerCircle + " units");
			
			break;
		case 3:
			System.out.println("You have selected Triangle...");
			System.out.println("Enter Base: ");
			double base = sc.nextDouble();
		
			System.out.println("Enter height: ");
			double height = sc.nextDouble();
			
			System.out.println("Enter Side2 : ");
			double side2 = sc.nextDouble();
			
			System.out.println("Enter Side3 : ");
			double side3 = sc.nextDouble();
			
			double areaAnswerTriangle = TwoDShape.computeAreaTriangle(base, height);
			double perimeterTriangle = TwoDShape.computePerimeterTriangle(base, side2, side3);
			
			System.out.println("Area of rectangle with base "+ base + " height "+ height + " is " + areaAnswerTriangle + " cm ");
			System.out.println("Perimeter of triangle with side1 " + base + ", side2 " + side2 + " and side3 " + side3 + " is " + perimeterTriangle + " units");
			
			break;
			
		case 4:
			System.out.println("*************************");
			System.out.println("Thankyou for exiting the application");
			System.out.println("*************************");
			System.exit(0);
			
		default:
			System.out.println("*************************");
			System.out.println("Please choose a valid Option");
			System.out.println("*************************");
			
		}
		
		System.out.println("Do you want to continue ? (y/n) : ");
		answer = sc.next().charAt(0);

	}while(answer == 'y');
	System.out.println("*****************************");
	System.out.println("THANLYOU! Exiting the application!" );
	System.out.println("*****************************");
	}
}
