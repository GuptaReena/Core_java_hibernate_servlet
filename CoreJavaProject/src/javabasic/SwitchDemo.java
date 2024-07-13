package javabasic;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day: ");
		String day =  sc.next();
		
		switch(day) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thrusday":
		case "Friday":
			System.out.println(day + " is a weekday");
			break;
			
		case "Saturday":
		case "Sunday" :
			System.out.println(day + " is a weekend");
			break;
			default:
				System.out.println(day + "is an invalid  day");
				
		}
		System.out.println("Have a Good Day!");
		
//		for(int i =0; i<5; i++) {
//			System.out.println("Hello");
//			i++;
//			i--;
//		}
		
	}

}
