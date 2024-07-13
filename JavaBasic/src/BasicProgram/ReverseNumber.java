package BasicProgram;

import java.util.Scanner;

public class ReverseNumber {
	
	//check if the number is prime or not
	
	public static int evenOdd(int n) {
		
		if(n % 2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		
		return n;
	}
	
	
	//Number is Prime or Not
	
		public static String isPrime(int n) {
			
			if(n<=1)
				return "Enter a valid Number ";
			
			for(int i =2 ; i<n; i++) 
				
				if(n % i == 0)
					
					return "Number is Not Prime";
				
				
			return "Number is Prime";
			
		}	
	
		
	//Twisted prime or not
		
		public static String twistedPrime(int n) {
		
			int mark = 0;
			int rem;
			int rev = 0;
			
			
			while(n !=0) {
				rem =  n%10;
				rev=  rem+rev*10;
				n = n/10;
				
			}
			
			for(int i= 0; i<=rev ; i++) 
				if(n % rev ==  0) 
					 mark ++;
			
			if(mark == 0)
				return "Number is Prime";
			
			return "Number is not Prime";
		}
	
	//Reverse a String
	public static String reverseString(String str) {
		
		char ch;
		String nstr="";
		
		for(int i = 0; i<str.length(); i++) {
			
			ch = str.charAt(i);
			nstr =  ch+nstr;
		}
		
		return nstr;
	}
	
	
	//Revese a number
	
	public static int reverseNumber(int n) {
		
		int rev = 0;
		int rem;
		
		
		while(n!=0) {
			rem = n%10;
			rev = rem+ rev*10;
			n = n/10;
		}
		
		return rev;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("----------Reverse String ---------------");
		
		//Revserse a String
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  String : ");
		String str = sc.next();
		
		System.out.println("Reverse word : "+ reverseString(str));
		
		
		
		//Reverse a Number
		System.out.println("----------Reverse Number-----------------");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n1 = sc1.nextInt();
		System.out.println("Reverse Number is : "+ reverseNumber(n1));
		
		
		//Number is even
		System.out.println("----------Even Odd Number-----------------");
		Scanner sc2 =  new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n2= sc2.nextInt();
		System.out.println(evenOdd(n2));
		
		
		//Number is prime or not
		System.out.println("-----------Prime Or Not Prime------------");
		Scanner sc3 =  new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n3= sc3.nextInt();
		System.out.println(isPrime(n3));
		

		//Number is prime or not
		System.out.println("-----------Twisted Prime Or Not Prime------------");
		Scanner sc4 =  new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n4= sc4.nextInt();
		
		System.out.println(twistedPrime(n4));
	}

}
