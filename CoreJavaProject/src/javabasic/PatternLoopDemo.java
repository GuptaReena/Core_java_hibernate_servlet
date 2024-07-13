package javabasic;

import java.util.Scanner;

public class PatternLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
			System.out.print(j + " ");
		}
			System.out.println();
		}
		System.out.println("\n------------");
	}

}
