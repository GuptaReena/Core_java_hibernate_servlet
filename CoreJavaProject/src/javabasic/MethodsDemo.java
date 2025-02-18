package javabasic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MethodsDemo {

	// here this method will greet based on system time
		// method definition
		public static void greet() {
			LocalTime nowTime = LocalTime.now(); // this line will obtain the system time
			int hour = nowTime.getHour();
			if(hour >= 6 && hour < 12) {
				System.out.println("Good Morning!!");
			}else if(hour >= 12 && hour < 17) {
				System.out.println("Good Afternoon!!");
			}else if(hour >= 17 && hour < 21) {
				System.out.println("Good Evening!!");
			}else {
				System.out.println("Good Night!!");
			}

		}
		// logic to find base to a power
		public static int computeBasePower(int baseNumber, int powerNumber) {
			// lets write the logic here
			// java does not support **
			// int output = (int)Math.pow(baseNumber, powerNumber);
			int output = 1;
			for(int i=0;i<powerNumber;i++) {
				output *= baseNumber;
			}
			return output;
		}
		
		public static int computeRandomNumber() {
			int output = (int)(Math.random() * 100);
			return output;
		}
		
		public static String computeLeapYear(LocalDate date) {
			int year = date.getYear();
			String output = "";
			if(year % 4 == 0) {
				output = "leap year";
			}else {
				output = "not a leap year";
			}
			return output;
		}
		
		public static void main(String[] args) {
			// any program will have input, process/logic/bussiness logic, output
			// now we will segregate the input, logic and output
			// keep the input and output here in main method
			// move the logic to a seperate method
			greet();// method invocation
			
			System.out.println("------------------------------------------------");
			
			//input
			System.out.println("TO COMPUTE BASE TO POWER");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the base number:");
			int base = scan.nextInt();
			System.out.println("Enter the power number:");
			int power = scan.nextInt();
			
			//process - the process should be in a seperate method
			// method invocation
			int answer = computeBasePower(base, power);
			
			//output
			System.out.println(base + " to the power of " + power + " is " + answer);
			
			System.out.println("------------------------------------------------");
			
			// TO GENERATE A RANDOM NUMBER BETWEEN 1 AND 100
			System.out.println("TO GENERATE A RANDOM NUMBER BETWEEN 1 AND 100");
			// no input
			// process -  we have to call a method here
			int answer1 = computeRandomNumber();
			// output
			System.out.println("Random number between 1 and 100: " + answer1);
			
//			System.out.println("------------------------------------------------");
//			// GIVEN DATE IS LEAP YEAR OR NOT
//			System.out.println("GIVEN DATE IS LEAP YEAR OR NOT");
//			// input
//			System.out.println("Enter the Day:");
//			int day = scan.nextInt();
//			System.out.println("Enter the Month:");
//			int month = scan.nextInt();
//			System.out.println("Enter the Year:");
//			int year = scan.nextInt();
//			// construct a date object using LocalDate
//			LocalDate myDate = LocalDate.of(year, month, day);
//			
//			// process
//			String answer2 = computeLeapYear(myDate);
//			
//			//output
//			System.out.println(year + " is " + answer2);
		}


}
