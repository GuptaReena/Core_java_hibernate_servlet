package javabasic;

public class Patterns {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Pattern 2*/
		pattern2(4);
		/*Pattern 1*/
		pattern1(5);
	}
	
	/*pattern no 1
	 	*****
	 	*****
	 	*****
	 	*****
	 	***** 
	*/
	static void pattern1(int n) {
		
		for(int row = 1; row<=n ; row++) {
			for(int col = 1; col <=n; col++) {
				System.out.print("* ");
			}
			//after every row is printed we need a new line 
			System.out.println();
		}
	}
	
	
	/*Pattern No 2
	 
	   *
	   **
	   ***
	   ****
	*/
	
	static void pattern2(int n) {
		//traverse the outer for loop
		for(int row = 1; row<=n; row++) {
			//for each row run the col
			for(int col = 1 ; col<=row; col++) {
				System.out.print("* ");
			}
			//after every row is printed we need a new line 
			System.out.println();
		}
		
	}
	
	

}
