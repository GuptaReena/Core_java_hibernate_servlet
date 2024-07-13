package javabasic;

import java.util.Scanner;

public class InputUsingScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter Student's Id : ");
		int studId = scan.nextInt();
		
		System.out.println("Enter Student's Age:");
		int studAge = scan.nextInt();
		
		System.out.println("Enter Student's Math Marks : ");
		int studMathMark = scan.nextInt();
		
		System.out.println("Enter Student's Science Marks :");
		int studsciMark = scan.nextInt();
		
		System.out.println("Enter Student's City : ");
		String studCity = scan.next();
		
		double studAvgMark = (studMathMark + studsciMark) / 2;
		
		System.out.println("Student's Id: "+ studId );
		System.out.println("Student's Age: "+ studAge);
		System.out.println("Student's Maths Mark: "+ studMathMark);
		System.out.println("Student's Science Mark: "+studsciMark);
		System.out.println("Student's average Mark: "+studAvgMark);
		System.out.println("Student's City: "+studCity);
		
		

	}

}
